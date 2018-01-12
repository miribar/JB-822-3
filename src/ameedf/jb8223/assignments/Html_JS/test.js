//calling the functionp
test();

function test() {
//     let str = "";
//
//     for (let i=0 ; i<10 ; i++)
//     {
//         str += i + ",";
//     }
//     alert(str);

    let date = new Date();
    let day = date.getDate();
    let month = "";
    let monthNum = parseInt(date.getMonth()) + 1;
    if (monthNum < 10) {
        month += "0" + monthNum;
    }
    let year = date.getFullYear();
    let str = day + "/" + month + "/" + year;

    alert(str);
}