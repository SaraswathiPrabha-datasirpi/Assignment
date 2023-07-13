var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var a = "Prabha";
console.log(a);
var b = 10;
console.log(b);
var c = false;
console.log(c);
var value;
(function (value) {
    value[value["new"] = 5] = "new";
    value[value["box"] = 6] = "box";
    value[value["switch"] = 7] = "switch";
})(value || (value = {}));
console.log(value);
var data1 = {
    name: "Selvi",
    age: 22,
    phNo: 98750446728
};
console.log(data1);
var product = /** @class */ (function () {
    function product() {
    }
    return product;
}());
var sample = {
    productName: "Apple",
    productType: "Fruit"
};
console.log(sample);
var sp = [
    { name: "Prabha", id: "1", department: "CSE" },
    { name: "Priya", id: "2", department: "ECE" },
    { name: "Selvi", id: "3", department: "IT" },
    { name: "Ravi", id: "4", department: "CSE" }
];
var sd;
sp.forEach(function (details) {
    if (details.id === "3") {
        sd = details;
    }
});
console.log(sd);
var ac = sp.find(function (details1) { return details1.department === "CSE"; });
console.log(ac);
var ad = sp.filter(function (details2) { return details2.department === "CSE"; });
console.log(ad);
var d = sp.map(function (details3) {
    if (details3.id === "2") {
        return __assign(__assign({}, details3), { id: "1" });
    }
    return details3;
});
console.log(d);
var p = sp.map(function (details4) {
    return details4.name;
});
console.log(p);
