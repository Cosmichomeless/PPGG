fetch("https://reqres.in/api/unknown/2")
    .then((res) => res.text())
    .then((res) => console.log(JSON.parse(res)));

fetch("https://reqres.in/api/users", {
    method: "POST",
    body: JSON.stringify({ name: "David", job: "Rodriguez" }),
    headers: { "Content-Type": "application/json" },
})
    .then((res) => res.text())
    .then((res) => console.log(JSON.parse(res)));

fetch("info.txt", {
    // aqui coge los datos de un archivo txt local
    method: "GET",
    headers: { "Content-Type": "application/json" },
})
    .then((res) => res.text())
    .then((res) => console.log(res));
