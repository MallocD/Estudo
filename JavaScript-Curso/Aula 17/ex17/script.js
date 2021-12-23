
var res = document.getElementById("res")

        function calcular(){
                var num = Number(document.getElementById("num").value)
                var i = num
                res.innerHTML = `1x${num}=${2*i}<p>3x${num}=${3*i}`

        }
