var agora = new Date()//Pegar horas do sistema
var hora = agora.getHours()//Pegar horas do sistema

  if(hora<6){
    console.log("Boa Madrugada")}
  else if( hora<12 ){
    console.log('Bom dia')
} else if( hora<18){
    console.log("Boa tarde")
} else {
    console.log("Boa noite")
}