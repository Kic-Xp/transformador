package br.com.alura.refl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Transformator {

    public <I, O> O transform(I input) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = input.getClass();
        Class<?> target = Class.forName(clazz.getName() + "DTO");

        O instanciaTarget = (O) target.getDeclaredConstructor().newInstance();

        Field[] clazzFields = clazz.getDeclaredFields();
        Field[] targetFields = target.getDeclaredFields();

        Arrays.stream(clazzFields).forEach(clazzField -> {
            Arrays.stream(targetFields).forEach(targetField -> {
                validate(clazzField, targetField);
                try {
                    targetField.set(instanciaTarget, clazzField.get(input));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
        });

        return instanciaTarget;
    }

    private void validate(Field clazzField, Field targetField) {
        if(clazzField.getType().equals(targetField.getType())
                && clazzField.getName().equals(targetField.getName())) {
            targetField.setAccessible(true);
            clazzField.setAccessible(true);
        }
    }
}
