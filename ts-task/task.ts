//string type
var a:string = "Prabha";
console.log(a);

//numeric type
var b : number= 10;
console.log(b);

//boolean type
var c : boolean = false;
console.log(c);

//enum type
enum value{
    value1 = 5,
    value2,
    value3
}
console.log(value);

//interface method
interface data{
    name : string;
    age : number;
    phNo : number;
}
 const data1 : data={
   name : "Selvi",
   age : 22,
   phNo : 9634899139

 }
 console.log(data1);

 //class method
 class product{
    productName : string;
    productType : string;
 }
 const sample: product={
    productName : "Apple",
    productType: "Fruit"
 }
 console.log(sample);

//type method
type Student = {
    name: string;
    id: string;
    department: string;
};

var sp: any = [
    { name: "Prabha", id: "1", department: "CSE" },
    { name: "Priya", id: "2", department: "ECE" },
    { name: "Selvi", id: "3", department: "IT" },
    { name: "Ravi", id: "4", department: "CSE" }
];

//for each
let sd: Student | undefined;

sp.forEach((details: any) => {
    if (details.id === "3") {
        sd = details;
    }
});

console.log(sd);

//find
let ac = sp.find((details1) => details1.department === "CSE");
console.log(ac);

//filter
let ad = sp.filter((details2) => details2.department === "CSE");
console.log(ad);

//map
let d = sp.map((details3) => {
    if (details3.id === "2") {
        return { ...details3, id: "1" };
    }
    return details3;
});
console.log(d);


let p = sp.map((details4) => {
    return details4.name

});

console.log(p);
