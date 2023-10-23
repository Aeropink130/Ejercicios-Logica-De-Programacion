// declaro la variable número para guardar la respuesta del usuario
let numero = 0;
do {
    numero = parseInt(prompt("Ingrese el número de la serie de Fibonacci que desea conocer: "));
    if (isNaN(numero)) {// compruebo si el valor es válido
        alert("Ingrese un valor válido");
    } else {
        break;
    }
} while (true);

// función que recibe el número dado por el usuario e imprime la serie fibonacci
function fibonacci(numero) {
    let penultimo = 0;
    let ultimo = 1;
    let fibo = [];// arreglo para almacenar los elementos de la serie   
    let temp;// para guardar cada elemento de la serie temporalmente

    for (let contador = 0; contador < numero; contador++) {
        if (contador <= 1) {
            temp = contador;
        } else {
            temp = penultimo + ultimo;
            penultimo = ultimo;
            ultimo = temp;
        }
        fibo.push(temp);
    }
    console.log(fibo);
}

if (numero < 0) {
    console.log("No puedes calcular una fibonacci con un número negativo");
} else {
    fibonacci(numero);
}   