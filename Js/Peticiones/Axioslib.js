axios
    .post("https://reqres.in/api/user", {
        method: "POST",
        data: { name: "david", age: 22 },
    })
    .then((res) => console.log(res));

axios("https://reqres.in/api/user", {
    method: "POST",
    data: { name: "david", age: 22 },
}).then((res) => console.log(res));

axios.get("info.txt").then((res) => console.log(res));

axios.post("info.txt").then((res) => console.log(res));
