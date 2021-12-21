


function verifica() {
 var data = new Date()
 var ano = data.getFullYear()
 var anoN = document.getElementById('ano')
 var anoNasc = anoN.value
 var res = document.querySelector('div#res')
 if (anoNasc <= 1904 || anoNasc > ano) {
  res.innerHTML = "Dados incorretos, revise-os!"
  alert('Dados incorretos, revise-os!')
 } else {
  var sexo = document.getElementsByName('rx')
  var idade = ano - anoNasc
  var genero = ""
  var img = document.createElement('img')
  img.setAttribute('id', 'foto')
  if (sexo[0].checked) {
   genero = "Masculino"
   if (idade < 10) {
    img.setAttribute('src', 'garoto.jpg')
   } else if (idade < 20) {
    img.setAttribute('src', '_imagens/boy.png')
   } else if (idade < 60) {
    img.setAttribute('src', '_imagens/man.png')
   } else {
    img.setAttribute('src', '_imagens/old-man.png')
   }
  } else {
   genero = "feminino"
   if (idade < 10) {
    img.setAttribute('src', '_imagens/kid-girl.png')
   } else if (idade < 20) {
    img.setAttribute('src', '_imagens/girl.png')
   } else if (idade < 60) {
    img.setAttribute('src', '_imagens/woman.png')
   } else {
    img.setAttribute('src', '_imagens/old-woman.png')
   }
  }
  res.innerHTML = `A idade da pessoa foi ${idade} anos e o gênero ${genero}.`
  img.style.padding = "10px"
  res.appendChild(img)
 }
}