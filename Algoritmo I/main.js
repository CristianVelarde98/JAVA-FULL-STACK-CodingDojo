// // ejercicio 1
for (var i = 0; i < 5; i++) {
  console.log(i); // 0, 1, 2, 3, 4
}

// outputs ordenados: 0, 1, 2, 3, 4

// /****************************************************** */
// // ejercicio 2
for (var i = 0; i < 5; i++) {
  i = i + 1;
  console.log(i); // 1, 3, 5
}

// outputs ordenados: 1, 3, 5

// /****************************************************** */
// // ejercicio 3
for (var i = 0; i < 5; i++) {
  i = i + 3;
  console.log(i); // 3, 7
}

// outputs ordenados: 3, 7

/****************************************************** */
// ejercicio 4
function y(num1, num2) {
  return num1 + num2;
}
console.log(y(2, 3)); // 5
console.log(y(3, 5)); // 8

// outputs ordenados: 5, 8

// /****************************************************** */
// ejercicio 5
function y(num1, num2) {
  console.log(num1); // 2,  3
  return num1 + num2;
}
console.log(y(2, 3)); // 5
console.log(y(3, 5)); // 8

// outputs ordenados: 2, 5, 3, 8

// /****************************************************** */
// // ejercicio 6
a = 15;
console.log(a); // 15
function y(a) {
  console.log(a); // 10
  return a;
}
b = y(10);
console.log(b); // 10

// outputs ordenados: 15, 10, 10

// /****************************************************** */
// // ejercicio 7
a = 15;
console.log(a); // 15
function y(a) {
  console.log(a); // 10
  return a * 2;
}
b = y(10);
console.log(b); // 20

// outputs ordenados: 15, 10, 20
