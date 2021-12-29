/*let jogos = {
    ps4: "Home" , ps5:"mile"
}

console.log(jogos.ps4)*/

let amigo = {nome: 'João',//Cria o objeto
sexo: 'M',
peso: 76.5,
altura: 1.70,
crescer(a=0){//Function dentro do objeto
    this.altura += a//Auto referência ao objeto altura
},
engordar(p=0){
    this.peso += p


}}
amigo.engordar(4)//Retorna valor ao parâmetro da function engordar//Colocar funções dentro de variáveis
amigo.crescer(0.5)//Retorna valor ao parâmetro da function crescer//Colocar funções dentro de variáveis

console.log(`${amigo.nome} pesa ${amigo.peso}kg e mede ${amigo.altura}m`)