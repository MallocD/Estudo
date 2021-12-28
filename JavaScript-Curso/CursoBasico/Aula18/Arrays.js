let num = [2,5,2,7]
num.push(4)//Adiciona valores aos indíces na ultima posição da array
num[3] = 6//Adiciona valores aos índeces no índice escolhido
num.lenght//Comprimento da array
num.sort()//Irá pegar todos os valores da array e colocar em ordem

console.log(`Esses são todos os valores  da array : ${num}`)//Todos os valores da array
console.log(`O vetor tem ${num.length} posições`)
console.log(`O segundo valor da array é ${num[1]}`)//Irá mostrar o valor do índíce [1] que no caso é 5 porém como foi adicionado o sort() os valores foram ajustados em ordem;

for(c=0;num.length>c;c++){
    console.log(`A posição ${c} tem o valor ${num[c]}`)//Mostrar de forma mais limpa todos os valores da array
} 

for(c in num){
    console.log(num[c])//Forma mais facil de mostrar valores em arrays
}
console.log(`O valor 6 está na posição ${num.indexOf(6)}`)//Descobrir qual o índice do valor