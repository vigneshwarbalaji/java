function myFunction() {
    var btn = document.createElement("BUTTON");
    btn.innerHTML = "new";
    document.body.appendChild(btn);

    var a = "<h1>I am html</h1>";
    var button = document.createElement(a);
    document.body.appendChild(btn);

}

function tableFunction() {
    var table = document.getElementById("myTable");
    var row = table.insertRow(0);
    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    cell1.innerHTML = "first col";
    cell2.innerHTML = "second col";
}