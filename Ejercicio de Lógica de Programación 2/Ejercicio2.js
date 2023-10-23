let celcius;
do {
    numero = parseFloat(prompt("Ingrese la temperatura en °C"));
    if (isNaN(numero)) {
        alert("Ingrese un valor válido");
    } else {
        break
    }
} while (true);

let fahrenheit = (numero * 9 / 5) + 32;
console.log("La temperatura en °F es: " + fahrenheit);

let kelvin = numero + 273.15;
console.log("La temperatura en °K es: " + kelvin);
