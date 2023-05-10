# Mostra de Vídeos com Padrão de Projeto Iterator

Este repositório contém um exemplo de código em Java que demonstra a implementação do padrão de projeto Iterator para percorrer uma lista de vídeos. O código utiliza o padrão Iterator para fornecer uma forma de acessar os elementos de uma coleção sequencial sem expor os detalhes de sua implementação.

## Padrão de Projeto Iterator

O padrão de projeto Iterator é um padrão comportamental que permite percorrer elementos de uma coleção sequencial sem expor sua estrutura subjacente. Ele fornece uma interface comum para percorrer diferentes tipos de coleções, encapsulando a lógica de iteração em uma classe separada.

No código deste repositório, o padrão Iterator é implementado com as seguintes classes:

- `MostraVideo.java`: Classe principal que contém o método `main()` responsável por inicializar a lista de vídeos, criar um iterador e percorrer os itens da lista utilizando o iterador.

- `VideoItem.java`: Classe que representa um item de vídeo, contendo atributos como nome e nota no IMDB.

- `VideoIterator.java`: Classe que implementa a interface `Iterator` e fornece os métodos `next()` e `hasNext()` para percorrer os itens da lista de vídeos.

- `Iterator.java`: Interface que define os métodos `hasNext()` e `next()` para um iterador genérico.

## Execução do Código

Para executar o código, siga as etapas abaixo:

1. Certifique-se de ter o ambiente Java configurado corretamente em seu sistema.

2. Compile os arquivos Java executando o comando `javac MostraVideo.java VideoItem.java VideoIterator.java Iterator.java` no diretório onde os arquivos estão localizados.

3. Execute o programa principal usando o comando `java MostraVideo`.

4. Observe a saída no console, que exibirá o nome e a nota no IMDB de cada item de vídeo.

Sinta-se à vontade para explorar e modificar o código de acordo com suas necessidades.

**Observação:** Certifique-se de ter as permissões necessárias para acesso aos vídeos e verifique a documentação oficial da linguagem Java para obter mais informações sobre os conceitos utilizados no código.

