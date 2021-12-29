//Arrow Functions

(a,b) =>{//Sintaxe 
 return a+b;
}

(a,b) => a+b;//Sintaxe como ternário


let a = 5
let b = 5

let c = (num1,num2) => num1+num2

console.log(c(a,b))

let d=(x,y) =>{//Sintaxe com chaves, passando os argumentos x e y
    let z // Váriavel que receberá valor
  if(y>3){
      z= x/y
  }else{
      z=x*y
  }
  return z//Retornar valor após as condições serem testadas
}
console.log(d(a,b))//Mostrar na tela o valor

let frase = "Um dia seria um grande Desenvolvedor e Programador"
let fraseArray = (frase) => frase.split(' ')//Separa a string em argumentos de array

console.log(fraseArray(frase))

//Sem arg

let semArg = () => console.log("Não tenho argumentos")//Uma array sem argumentos, somento como função
semArg()

//Casos de uso

let roupas =[
    {produtos: 'Camisa', preço : 25, cor: "Amarelo"},   
    {produtos: 'Calça', preço : 42, cor: "Azul"},
    {produtos: 'Jaqueta', preço : 31, cor: "Preto"},  
    {produtos: 'Camiseta', preço : 32, cor: "Branco"},  
    {produtos: 'Calção', preço : 22, cor: "Verde"},   
]
let precoMaior = roupas.filter((roupa) => {//Filtrar um determinado valor utilizando arrow function
    return roupa.preço >=31
})
console.log(precoMaior)

setTimeout(()=>{//Seta um valor junto com arrow function e após esse valor o argumento é mostrado no console
    console.log("Hello")
},10000)

setTimeout(function(){//Seta um valor junto utilizando function somente e após esse valor o argumento é mostrado no console
    console.log("Hello")
},10000)


//Não usar Arrow

let pessoa = {
    nome : "João",
    sayName:function(){
        console.log(this.nome)
        console.log(this)
    }
}
    pessoa.sayName()

    let btn = document.getElementById('btn')
    console.log(btn)

    btn.addEventListener('click',function(){
        this.classList.toggle('classe')//Adiciona o evento para que quando haja o click crie se um class no btn
    })