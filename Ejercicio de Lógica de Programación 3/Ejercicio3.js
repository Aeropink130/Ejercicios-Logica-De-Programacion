let numero;
let factorial = 1;
do {
    numero = parseFloat(prompt("Ingrese un número para calcular su factorial"));
    if (isNaN(numero)) {
        alert("Ingrese un valor válido");
    } else {
        break
    }
} while (true);

for (let contador = 1; contador <= numero; contador++) {
    factorial *= contador;
}

console.log(factorial);