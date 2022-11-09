# Dev Dojo Maratona Java - William Suane

## Como Java Funciona

![](.README_images/dab130f4.png)

Cada JVM é especifica para cada SO.
JDK -> possui uma JVM, um compilador, ferramentas de debug. - (Desenvolver)
JRE -> apenas para executar 

arquivo fonte .java que nós vamos compilar e transformar num arquivo .class esse .class nós chamamos de byteCode que
será executado pela JVM.
A JVM vai interpretar e se preocupar em trabalhar com os SO.

## Pacotes

Pacotes eles ajudam a organizar e agrupar as classes que tem coisas em comum. 

A estrutura de pacotes nada mais é que uma estrutura de diretórios. 

- A convenção para criar pacotes começa com:

o dominio do seu site -> seguido do nome do projeto -> e o que você quer ter no seu pacote

## Comentários 

Comentários são pedaços de textos que não influenciam no código

- Comentários Multiplas linhas /**/
- inline //
- Comentários java doc /*
                       *
                        /*
Evitar incluir comentários - péssima prática
Métodos publicas são interesantes tem javadoc

## Tipos primitivos pt 01 - convenções de variáveis

Temos 8 tipos primitivos

![](.README_images/f514819a.png)

- O que são tipos primitivos? são tipos que vão guardar em memória um valor simples
- todos escritos em letras minusculas
- padrão camelCase
- todos os tipos primitivos são numéricos com exceção do boolean, pois o char eu também posso usar numerico.
- A diferença entre eles é a quantidade de valor que você pode colocar dentro do espaço em memória
- byte por exemplo  tem 1 byte e significa 8 bits. 


## casting 

O casting é uma transformação aplicada em valores numéricos para modificar seu tipo de dado.
Casting é quando você força o java a colocar o valor de uma variavel dentro da outra.
Casting não é uma boa prática é mais indicado mudar o tipo

        int age2=(int)10000000000L;
        System.out.println(age2); //após forçar não coube então ele corta os bits, pois ele força a entrada de valores
        //1410065408

## String

String é um tipo de referencia (reference type) e não um tipo primitivo.
String é uma Classe.

## Operadores Relacionais

Operador em java é um símbolo que é usado para executar operações. Por exemplo: +, -, *, / etc.

Existem muitos tipos de operadores em Java que são fornecidos abaixo:

        Operador aritmético,
        Operador Unário,
        Operador shift,
        Operador relacional,
        Operador bit a bit (bitwise),
        Operador lógico,
        Operador ternário e
        Operador de atribuição.

![](.README_images/262078ee.png)

## Estruturas condicionais em Java

As estruturas condicionais possibilitam ao programa tomar decisões e alterar o seu fluxo de execução. 
Isso possibilita ao desenvolvedor o poder de controlar quais são as tarefas e trechos de código executados de acordo com 
diferentes situações, como os valores de variáveis.

As estruturas condicionais geralmente analisam expressões booleanas e, caso estas expressões sejam verdadeiras, 
um trecho do código é executado. No caso contrário, outro trecho do código é executado.

- If/else
O if/else é uma estrutura de condição em que uma expressão booleana é analisada. Quando a condição que estiver 
dentro do if for verdadeira, ela é executada. Já o else é utilizado para definir o que é executado quando a condição
analisada pelo if for falsa. Caso o if seja verdadeiro e, consequentemente executado, o else não é executado.

- Switch/case
A estrutura condicional switch/case vem como alternativa em momentos em que temos que utilizar múltiplos ifs no código. 
Múltiplos if/else encadeados tendem a tornar o código muito extenso, pouco legível e com baixo índice de manutenção.
O switch/case testa o valor contido em uma variável, realizando uma comparação com cada uma das opções. Cada uma dessas 
possíveis opções é delimitada pela instrução case.

## JAVA – Estruturas de Repetição

As estruturas de repetição também são conhecidas como laços (loops) e são utilizados para executar, repetidamente, uma 
instrução ou bloco de instrução enquanto determinada condição estiver sendo satisfeita.

Qualquer que seja a estrutura de repetição, ela contém quatro elementos fundamentais: inicialização, condição, corpo e 
iteração. 

- A inicialização compõe-se de todo código que determina a condição inicial da repetição. 
- A condição é uma expressão booleana avaliada após cada leitura do corpo e determina se uma nova leitura deve ser feita ou se a estrutura de repetição 
deve ser encerrada. 
- O corpo compõe-se de todas as instruções que são executadas repetidamente. 
- A iteração é a instrução que deve ser executada depois do corpo e antes de uma nova repetição.

## While

O termo while pode ser traduzido para o português como “enquanto”. Este termo é utilizado para construir uma estrutura 
de repetição que executa, repetidamente, uma única instrução ou um bloco delas “enquanto” uma expressão booleana for verdadeira.

Veja que a inicialização precede o início da repetição. Isso significa que você deve definir o estado inicial dos elementos 
que serão utilizados nesse laço antes de seu cabeçalho. A palavra reservada while sempre será seguida de um par de parênteses, 
que delimitam a condição desta estrutura de repetição. Essa condição deve ser uma expressão booleana e, enquanto ela for 
verdadeira, esta estrutura continuará executando as instruções contidas no seu corpo.


## Do while

A estrutura de repetição do-while é uma variação da estrutura while. Existe uma diferença sutil, porém importante, entre elas. 
Em um laço while, a condição é testada antes da primeira execução das instruções que compõem seu corpo. Desse modo, se a condição 
for falsa na primeira vez em que for avaliada, as instrução desse laço não serão executadas nenhuma vez. 
Em um laço do-while, por outro lado, a condição somente é avaliada depois que suas instruções são executadas pela primeira vez, 
assim, mesmo que a condição desse laço seja falsa antes de ele iniciar, suas instruções serão executadas pelo menos uma vez.

## Estrutura For

O laço for é uma estrutura de repetição compacta. Seus elementos de inicialização, condição e iteração são reunidos na 
forma de um cabeçalho e o corpo é disposto em seguida.

Veja a sintaxe geral de uma estrutura for:

Observe que a inicialização, condição e iteração aparecem, entre parênteses, após a palavra reservada “for” e elas são 
separadas apenas por um ponto-e-vírgula. A instrução ou bloco de instruções que este tipo de laço repete são transcritos a 
partir da linha subsequente ao seu cabeçalho.

O laço for e o laço while são apenas formas diferentes de uma mesma estrutura básica de repetição. Qualquer laço for 
pode ser transcrito em termos de um laço while e vice-versa. Do mesmo modo que em um laço while, se a condição de um 
laço for já é falsa logo na primeira avaliação que se fizer dela, as instruções contidas em seu corpo jamais serão executadas.


## Arrays


Um array é uma estrutura de dados usada para armazenar dados do mesmo tipo, ou seja reprsenta uma coleção. Os arrays armazenam seus elementos em 
localizações sequenciais contínuas da memória. Em Java, arrays são objetos. Todos os métodos da classe Object podem ser 
invocados em um array.
Permanecem com o mesmo tamanho depois de criados.

– É um objeto, daí ser considerado tipo por referência.

Características Array:

- Todo array é uma variavel do tipo Reference
- Quando declarado em escopo local deve ser inicializado antes de seu uso
- Quando declarado fora de um método será inicializado como null;


## VARIÁVEL DE REFERÊNCIA EM JAVA

Todas as variáveis no Java são “de referência” (exceto se elas forem de tipos primitivos, como “int”, “float”, “short”, 
“double”, “boolean”).

Elas ou apontam para algum objeto, ou então estão vazias (valor “null”).


## Arrays Multidimensionais

Arrays Multidimensionais são estruturas de dados que possuem duas ou mais dimensões. Em suma, temos que um Array que contém 
uma única dimensão funciona internamente como um Array multidimensional. A diferença está na quantidade de índices que cada 
elemento da nossa estrutura terá como identificador.


![](.README_images/60d6feb0.png)

![](.README_images/a4a0b63b.png)

## OBSERVAÇÕES

- Variaveis locais precisam ser inicializadas senão o código vai falhar no momento da compilação
- 

## Orientação a Objetos

Orientação a objetos é um paradigma aplicado na programação que consiste na interação entre diversas unidades chamadas de objetos.

OO foi criada para mapear o mundo real , para o mundo computacional.

Conseguimos mapear utilizando objetos, que são compostos por atributos e métodos definidos a partir de classes, 
que por sua vez são organizadas em pacotes. Esses conceitos são tão centrais em Java que não se pode programar na 
linguagem sem utilizá-los.

Classe é o que nós temos em java para representar algo do mundo real com funcionalidades em comum. 
Classe é um agrupamentos de coisas do mundo real que vão dar origem a Objetos.

model, domnio ou domain são classes que representam a lógica de negócio.

Estudante estudante; variavel de referencia chamada estudante

Estudante estudante= new Estudante(); criar objetos precisa usar a palavra new e o nome do objeto Estudante();


## Métodos (Comportamento das classes)

Composiçao de um método

- primeira parte precisamos de modificadores de acesso
- retorno: segunda parte o retorno que pode ou não retornar algo, retorno é diferente de saída, podemos no caso de não
retornar nada usar o void(vazio).
- nome do método 
- ()
- {}

public void soma(){

}


## Usando varargs no Java


O Java, possui um recurso que automatiza e esconde o processo de pôr as variáveis num array para, em seguida, 
conseguir acessá-las dentro do método: o varargs. Os argumentos ainda são postos num array para ser passados ao método, 
mas o Java se encarrega de fazer isto por nós. Utilizando varargs, podemos, então, reescrever a declaração do método 
imprimirNomes da seguinte forma:

- Com array
public static void imprimirNomes(String[] nomes) {

}

- com varArgs 
public static void imprimirNomes(String... nomes)  {
// ...
}

- varargs na verdade é uma abreviação de uma passagem de um parâmetro array.
As reticências que seguem o tipo do parâmetro indicam que este método aceita um array;
- O método pode receber quantos parâmetros forem necessários, porém só pode ter apenas um varargs na assinatura do método.
- O varargs é um facilitador, ao invés de criar um array ou lista e colocar os valores dentro dele para depois chamar o 
método, o mesmo pode ser chamado diretamente passando os n valores e os parâmetros enviados são automaticamente adicionados 
em um array do mesmo tipo do varargs.
- se você tiver mais de um atributo o varArgs deverá ser o ultimo. caso você tenha mais de um parametro
Vantagem entre o array e varArgs é que diferentes do array eu posso passar os argumentos diretamente sem 


## Coesão

Coesão é algo que está relacionado ao propósito das suas classes.
Quando se fala que uma classe é altammente coesa é que ela não está misturando o propósito delas existirem.
A coesão é o grau com o qual um módulo tem uma responsabilidade única e bem definida.

## A coplamento

O acoplamento é o grau com o qual um módulo depende de outros módulos para seu funcionamento. O ideal, para que um 
sistema seja flexível e compreensível, são módulos com alta coesão e baixo acoplamento.

Uma forma de garantir ter baixo acoplamento é utilizando o modificador de acesso private, acoplamento tem a ver cquanto uma classe
sabe da outra. 

## Modificador private / get e set

Quando utilizamos o modificador de acesso private, significa que os atributos da classe só vão poder ser acessados
pelo o objeto.

Quando você cria métodos provados você cria um método publico.

Uma das convenções do java: todas as vezes quando você está criando um método para colocar um valor dentro de um atributo 
dentro da memória você começa digitando a palavra setNomeDaVariavel.

Estou dizendo que eu vou setar, colocar dentro do meu atributo nome
Ex: public void setNome(){
}

Quando lemos um código java e lemos get/set já sabemos que é para pegar/setar.

this.nome e this.idade está retornando o espaço disponível em memória ou seja .
A variavel de referencia fora do objeto só pode acessar o que estiver publico. Tanto atributos quanto métodos

![](.README_images/32c42c50.png)
    private String nome;
    private int idade;



    public void imprime( ) {

        System.out.println(this.nome);
        System.out.println(this.idade);
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    

this e idempotente: Tem-se idempotência quando se chama a mesma funcionalidade com o mesmo valor e o resultado é exatamente o mesmo;

Acoplamento está relacionado ao modificadores de acesso.


## Sobrecarga de métodos

Sobrecarga de método é você ter o método com o mesmo nome, porém o tipo ou a quantidade de parâmetros são diferentes.


## Construtores

Toda vez que você está criando um objeto, você está construindo um objeto.

O construtor será executado antes de qualquer método que você tem.

Construtor não tem nenhum tipo de retorno, ele tem um modificador de acesso seguido do nome da classe.

public Anime(){}

Toda classe possui um construtor padrão, mesmo que você não escreva


Também conhecidos pelo inglês constructors, os construtores são os responsáveis por criar o objeto em memória, ou seja, 
instanciar a classe que foi definida. Eles são obrigatórios



- Nota:

Em Java apenas as Interfaces não possuem construtores.

A principal diferença entre construtores e métodos é que Construtores criam e inicializam objetos que ainda não existem, 
enquanto Métodos realizam operações em objetos que já existem. Construtores não podem ser chamados diretamente; são 
chamados de forma implícita quando a palavra chave new cria um objeto.


## Blocos Inicializadores de Instância

bloco de inicialização de instância, por que ele é executado todas as vezes que esse objeto é criado
a regra é que ele é criado antes do construtor, independente de quantos objetos nós criarmos ele sempre
será executado.

Quando você aprendeu sobre métodos, viu chaves ({}). O código entre as chaves é chamado de bloco de código. Às vezes, 
esse código é chamado de code block. Em qualquer lugar que você ver chaves é um bloco de código.

Às vezes, os blocos de código estão dentro de um método. Estes são executados quando o método é chamado. Outras vezes, 
os blocos de códigos aparecem fora de um método. Estes são chamados de inicializadores de instância. 

Quantos blocos você vê neste exemplo? Quantos inicializadores de instância você vê?

            3: public static void main(String[] args) {
            4:   { System.out.println("Feathers"); }
            5:   }
            6:   { System.out.println("Snowy"); }


Existem três blocos de código e um inicializador de instância. 

Contar blocos de código é fácil: você apenas conta o número de pares de chaves. 
Se não houver o mesmo número de chaves abertas ({) e fechadas (}), o código não compila. 
Não importa que um conjunto de chaves esteja dentro do método main () - ainda conta.

Ao contar os inicializadores de instâncias, tenha em mente que não importa se as chaves estão dentro de um método. 
Há apenas um par de chaves fora de um método. A linha 6 é um inicializador de instância.

A diferença entre um bloco de inicialização e um construtor é que um bloco de inicialização de instancia é usado para 
inicializar variáveis de instância, eles são executados antes dos construtores e são executados toda vez que o objeto da 
classe é criado já os construtores são usados para inicializar o estado do objeto. Como os métodos, um construtor também 
contém uma coleção de instruções (ou seja, instruções) que são executadas no momento da criação do objeto.

Nota:

O que aconece quando você cria um objeto até o moento?

1. Alocado espaço em memória para o objeto
2. Cada atributo de classe é criado e inicializado com valores default(null para objeto e 0 para numerais e false para boolean)
ou o que dor passado no atributo;
3. Bloco de inicialização é executado
4. Construtor é executado


## Modificador Static


O uso do modificador STATIC em um atributo de classe, por exemplo, torna esse atributo possível de ser inicializado em 
qualquer parte da classe, mas quando recebe um valor, ele é compartilhado com todos os objetos da classe. Isso significa 
que os atributos estáticos de uma classe são compartilhados por todas as instâncias dessa classe.

Modificador static faz o atributo pertencer a classe. Todos os objetos vão compartilhar do mesmo valor.
Se você tentar alterar através de uma instancia, você na verdade está alterando todo o objeto em existencia dessa classe.

O modificador Static também pode ser aplicado a métodos e inicializadores, podendo existir tantos quantos forem necessários,
ou seja, não existe uma relação de dependência entre os membros estáticos ou não estáticos da classe.

Quando o operador STATIC é aplicado a um atributo da classe, o mesmo passa a ser compartilhado com todos os objetos dessa classe, 
mas diferente de como ocorre normalmente (com os atributos não estáticos), o atributo passa a ser conhecido como “atributo de classe”, 
sendo que todos os objetos instanciados dessa classe passam a compartilhar o mesmo atributo, similarmente ao que ocorre com variáveis 
globais em linguagens de programação estruturadas.

ntre os exemplos de atributos estáticos definidos na linguagem Java estão o java.lang.Math.E (2.71828...) e o famoso 
java.lang.Math.PI (3.14159...), os quais recebem a especificação public STATIC FINAL, representando que os atributos 
têm visibilidade pública, são acessíveis sem a necessidade de existir um objeto da classe e não podem ter seus valores 
alterados. Por exemplo, a chamada java.lang.Math.PI acessa diretamente o valor do atributo estático PI.

Os atributos estáticos normalmente são utilizados na padronização de valores (constantes) dentro do projeto/sistema, 
visando compartilhamento de informações entre os objetos e para acesso direto aos atributos da classe sem a necessidade 
de existir algum objeto instanciado dessa classe.

Considerando o uso do modificador STATIC em um método de uma classe, esse método é visto como pertencente à classe e 
não pode ser usado para chamar/usar métodos ou atributos da classe que não sejam estáticos. Como os métodos estáticos não 
funcionam com uma instância (objeto) da classe, eles só podem acessar membros estáticos (atributos e métodos) da classe 
ou de outras classes que forem visíveis.

Neste contexto, os métodos estáticos são muito úteis na definição de rotinas utilitárias dentro de um sistema.
Os métodos estáticos, quando declarados públicos, podem ser acessados diretamente a partir da classe, sem a necessidade 
de declaração de objetos. Isso quer dizer que um método, para ser acessível sem a necessidade de existir um objeto da classe, 
além de ser estático, também deve ser público. Se um método for definido como estático e privado, ele será acessível 
diretamente apenas a partir da própria classe e, se for definido como estático e protegido, será acessível diretamente 
a partir da classe, suas herdeiras e outras classes do mesmo pacote.

Métodos estáticos, por pertencerem à classe não podem ser abstratos, ou seja, o uso dos especificadores STATIC e 
abstract são antagônicos.

O modificador STATIC ainda pode ser usado na declaração de blocos de inicialização, que se tratam de trechos de código que 
serão executados automaticamente quando a classe for carregada em memória. Um dos objetivos desse recurso é quando a 
inicialização de um atributo estático não pode ocorrer no momento de sua declaração, ou seja, em uma única expressão.

Por que métodos staticos não podem acessar variáveis de instancia/atributos de instancia?
porque quando você utiliza static significa que existe a possibilidade de não existir um objeto em memória.
E se não existir um objeto em memória como você vai pegar uma variavel que se pode existir em memória um atributo de instancia.
Então você não vai poder usar variaveis que não são estaticas dentro de métodos estáticos.
Mas podemos acessar um stributo estatico dentro de um método não estático.

A criação de métodos (ou atributos) estáticos é interessante quando se intenciona que eles sejam de livre 
utilização, mas bem identificados por um contexto representado pela classe.

Um exemplo na Classe calculadora que criamos , todos os métodos poderiam ser estaticos, pois eles não estão acessando
nenhum atributo da instancia.

Bloco de inicialização estatico é executado apenas uma vez quando a classe é carregada pela JVM, isso acontece antes de qualquer coisa
antes mesmo do espaço ser alocado em memória para o objeto, se tiver mais de um ele é executado em sequencia.


##  Associação  - Arrays com objetos

![](.README_images/0717cefa.png)

- Associação é criar relacionamento entre objetos, no BD relacionamento entre tabelas.

1:1-> 1 para 1 -> unidirecional
é um relacionamento um para um que define que só há uma entidade relacionada com a outra.

1:n-> 1 para n
só deve existir uma entidade da classe onde esta relação é definida, mas esta entidade está 
associada a muitas entidades da outra classe. Essa relação vai ocorrer sempre que uma classe 
tem uma coleção de tipos de outra classe.

n:1-> n para 1
é a relação inversa a 1:n, deve especificar a entidade que é a parte muitos.

n:n -> n para n
é uma associação de muitos para muitos. É usada nos casos em que uma entidade de um tipo A pode estar
associada a muitas entidades do tipo B e cada entidade do tipo B também pode estar associada a várias 
entidades do tipo A

![](.README_images/a5830dc6.png)



## Referencias

- https://www.devmedia.com.br/construtores-em-java-primeiros-passos/28618
- https://sites.google.com/view/javacommiza/home/capitulo-01/criando-objetos/blocos-inicializadores-de-instancia
- https://www.devmedia.com.br/modificadores-de-acesso-do-java/27065
