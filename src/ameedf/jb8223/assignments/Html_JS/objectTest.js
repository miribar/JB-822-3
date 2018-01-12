
function doTest() {
    let person = {
        firstName:"John",
        lastName:"Doe",
        age:50,
        eyeColor:"blue",
        buildTable:function() {
            let str = "<table border='1'>\n";
            for (x in person) {
                console.log(typeof(person[x]));
                if (typeof(person[x]) !== 'function') {
                    str += "\t<tr><td>" + x + "</td><td>" + person[x] + "</td></tr>\n";
                }
            }
            str += "</table>";
            return str;
        }
    };

    return person.buildTable();

    // let person1 = new Object();
    // person1.firstName = "Dan";
    // person1.age = 40;

}

document.getElementById("myTable").innerHTML = doTest();