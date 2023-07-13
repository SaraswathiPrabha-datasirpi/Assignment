const student = [

    { name: "Prabha",id: "1", department: "CSE"},
    { name: "Priya", id: "2", department: "ECE"},
    { name: "Selvi", id: "3", department: "IT"},
    { name: "Ravi",  id: "4", department: "CSE"}
];

//for each
let studentData
student.forEach((details) => {
    if(details.id == 3){
       studentData = details
    }
     
})
console.log(studentData);

//find function
let sample 
sample= student.find(details1=>(details1.department=="CSE"));
console.log(sample);

//filter function
let test
test=student.filter(details2=>(details2.department=="CSE"));
console.log(test);

//map function to change existing data to new data
let data
data = student.map((details3) => {
    if(details3.id==2){
        return {...details3, id: "1"};
    }
        return details3;

});


console.log(data);


//map function to fetch particular data
let pack
pack= student.map((details4) => {
return details4.name
});

console.log(pack);

//Concatenation
console.log(`Hello my name is ${student[0].name}`);

