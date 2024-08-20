Descrição geral do projeto
Este projeto contém uma implementação simples de um utilitário para converter objetos Java em formato JSON. Ele utiliza a biblioteca Jackson para realizar a serialização e permite que qualquer objeto Java seja transformado em uma string JSON de forma fácil e rápida.
Além disso, o projeto inclui uma classe utilitária chamada Transformator que permite transformar objetos Java de um tipo para outro, usando reflexão para mapear os campos entre as classes. Essa funcionalidade pode ser útil, por exemplo, para converter objetos de entidade para objetos de transferência de dados (DTO).
Principal propósito do projeto sendo o uso excessivo de reflection api do java, fazendo um código bastante flexível e com escalabilidade.

Principais arquivos e funcionalidades

ObjectToJson.java: Contém a classe ObjectToJson que possui um método transform para converter objetos Java em JSON.
ObjectToJsonTester.java: Arquivo de teste que demonstra o uso da classe ObjectToJson para converter um objeto simples do tipo Pessoa em uma string JSON.
Transformator.java: Implementa a classe Transformator que possui um método genérico transform para converter objetos Java de um tipo para outro.
