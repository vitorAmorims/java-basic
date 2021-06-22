const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question("Digite um número para saber se é número primo: ", number => {  
  let numero = Number(number);
  
  verificarNumeroPrimo(numero);
  readline.close();
});

function verificarNumeroPrimo(isNumber){
  let index, model, flag = 0;
  if (typeof isNumber === 'number'){
      model = isNumber / 2;
      if (isNumber == 0 || isNumber == 1){
        console.log(isNumber + " is not Prime number ");
      } else {
          for(index = 2; index <= model; index++) {
              if(isNumber % index == 0){
                  console.log(isNumber + " is not Prime number ");
                  flag = 1;
                  break;
              }
              if (flag == 0){
                  console.log(isNumber + " is Prime number ");
                  break;
              }
          }
      }
  } else {
      console.log("Impossivel calcular");
  }   
}
