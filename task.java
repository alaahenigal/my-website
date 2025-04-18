function sayHello(theName, theGender) {
   if (theGender === "Male") {
       console.log(`Hello Mr ${theName}`);
      } else if (theGender === "Female") {
        console.log(`Hello Miss ${theName}`);
     } else {
       console.log(`Hello ${theName}`);
     }
  }
  sayHello("Osama", "Male"); // "Hello Mr Osama"


   function calculate(firstNum, secondNum, operation) {
  if (secondNum === undefined) {
   console.log("Second Number Not Found");
  } else {
    if (operation === undefined) {
      console.log(firstNum + secondNum);
   } else if (operation === "add") {
      console.log(firstNum + secondNum);
    } else if (operation === "subtract") {
      console.log(firstNum - secondNum);
   } else if (operation === "multiply") {
    console.log(firstNum * secondNum);
    }
  }
}
  sayHello("Eman", "Female"); // "Hello Miss Eman"
 sayHello("Sameh"); // "Hello Sameh"


 
 //
  // Needed Output
  calculate(20); // Second Number Not Found
  calculate(20, 30); // 50
  calculate(20, 30, 'add'); // 50
  calculate(20, 30, 'subtract'); // -10
  calculate(20, 30, 'multiply'); // 600



 function ageInTime(theAge) {
    if (theAge < 10 || theAge > 100) {
      console.log('Age Out Of Range');
    } else {
      console.log(`The year is ${theAge}`);
      console.log(`The months is ${theAge * 12}`);
    }
  }
  
  ageInTime(110);  // Age Out Of Range
  ageInTime(31);   // 



  function checkStatus(a, b, c) {
    var name, age, status;
  
    
    if (typeof a === "string") {
      name = a;
    } else if (typeof a === "number") {
      age = a;
    } else if (typeof a === "boolean") {
      status = a;
    }
  
    if (typeof b === "string") {
      name = b;
    } else if (typeof b === "number") {
      age = b;
    } else if (typeof b === "boolean") {
      status = b;
    }
  
    if (typeof c === "string") {
      name = c;
    } else if (typeof c === "number") {
      age = c;
    } else if (typeof c === "boolean") {
      status = c;
    }
  
    
    if (status === true) {
      console.log(`Hello ${name}, Your Age Is ${age}, You Are Available For Hire`);
    } else {
      console.log(`Hello ${name}, Your Age Is ${age}, You Are Not Available For Hire`);
    }
  }
  
  // Needed Output
  checkStatus("Osama", 38, true);   // "Hello Osama, Your Age Is 38, You Are Available For Hire"
  checkStatus(38, "Osama", true);   // "Hello Osama, Your Age Is 38, You Are Available For Hire"
  checkStatus(true, 38, "Osama");   // "Hello Osama, Your Age Is 38, You Are Available For Hire"
  checkStatus(false, "Osama", 38);  // "Hello Osama, Your Age Is 38, You Are Not Available For Hire"

  
  function createSelectBox(startYear, endYear) {
    document.write('<select>')
    for(i=startYear;i<=endYear;i++){
        document.write(`<option value="${year}">${year}</option>`);
    }
    document.write('</select>');
  }
  createSelectBox(2000, 2021);



  function multiply(...argument) {
    var result = 1;
  
    for (let i = 0; i < argument.length; i++) {
      if (typeof argument[i] === "string") {
        continue;
      } else {
        result *= parseInt(argument[i]);
      }
    }
  
    console.log(result);
  }





  function getDetails(zName, zAge, zCountry) {
    function namePattern(zName) {
      var name=zName.spilt("");
      return"${name[0]}${name[1][0]}.";
      
      // Osama Mohamed => Osama M.
      // Ahmed ali => Ahmed A.
    }
    function ageWithMessage(zAge) {
        var name=zAge.spilt("");
        return'Your age Is${name[0]}';
      // 38 Is My Age => Your Age Is 38
      // 32 Is The Age => Your Age Is 32
    }
    function countryTwoLetters(zCountry) {
        var name=zCountry.spilt('');
        return'you live in ${name[0]}${name[1]}};
      
      // Egypt => You Live In EG
      // Syria => You Live In SY
    }
    function fullDetails() {
      // Write Your Code Here
    }
    return fullDetails(); // Do Not Edit This
  }
  
  console.log(getDetails("Osama Mohamed", "38 Is My Age", "Egypt"));
  // Hello Osama M., Your Age Is 38, You Live In EG
  
  console.log(getDetails("Ahmed ali", "32 Is The Age", "Syria"));
  // Hello Ahmed A., Your Age Is 32, You Live In SY
  



  function itsMe() {
    return `Iam A Normal Function`;
  }
  
  console.log(itsMe()); // Iam A Normal Function

  
//Arrow Function

  const itsMe = () => {
    return `Iam A Normal Function`;
  };





  function specialMix(...data) {
    var result=0;
    for (let i = 0; i < data.length; i++) {
        if (typeof data[i] == "number") {
          result += data[i];
        }else if (typeof data[i] == "string") {
            var add = parseInt(data[i]);
            if (!isNaN(num)) {
              add += num;
            }
          }
        }
  
  console.log(specialMix(10, 20, 30)); // 60
  console.log(specialMix("10Test", "Testing", "20Cool")); // 30
  console.log(specialMix("Testing", "10Testing", "40Cool")); // 50
  console.log(specialMix("Test", "Cool", "Test")); // All Is Strings



  let mix = [1, 2, 3, "E", 4, "l", "z", "e", "r", 5, "o"];

  let results = mix.map(function(current) {  // هنا استخدمنا "item"
    if (typeof current === "string") {
      return current;
    } else {
      return "";
    }
  }).reduce(function(acc, current) {
    return acc + current;
  });
  
  console.log(results); // Elzero





  

  




 
  