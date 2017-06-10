# MVE_ForDummies
MVE For Dummies é um programinha safado para facilitar a procura das abreviações utilizadas no EMV.

#Rodar o programa diretamente.
1. - Faça o clone do projeto ou download
2. - Dentro da pasta do projeto (é necessário ter o java 8 ou superior instalado e configurado nas variaveis de ambiente) digite:
     <br>`java -jar MVE_ForDummies-v1.jar`

#Fazer o build e rodar o programa
Caso não confie na origem do jar e queira buildar o programa diretamente.
1. - Faça o clone do projeto ou download
2. - Importe para o seu IDE favorito no estilo Maven Project
3. - Dentro da pasta do projeto (é necessário ter o java 8 ou superior instalado junto do Maven configurado nas variaveis de ambiente) digite:
    <br>`mvn clean install`
4. - o jar do projeto será criado na pasta target dentro do projeto.
5. - ainda dentro da pasta do projeto digite:
     <br>`java -jar target/MVE_ForDummies-v1.jar`
     
#Funcionamento
Ao rodar o programa o prompt printa a mensagem
<br>`Digite a abreviação, listar ou sair`
Ao digitar a abreviação por exemplo : "IEC"
o resultado será:
<br>`IEC = International Electrotechnical Commission`
*As abreviações são case-sensitives.
Ao digitar "listar" será impresso a lista de todas as siglas e seus significados. *listar não são case-sensitive.
Ao digitar "sair" o programa se encerra. *sair não é case-sensitive.
