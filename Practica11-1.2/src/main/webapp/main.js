function registro(){
     
        let http = new XMLHttpRequest;
        http.onreadystatechange = function() {
            if (http.readyState == 4 && http.status == 200) {
                alert(http.responseText);
            }
        }
        http.open("POST", "Registro", true);
        http.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        http.send("username=" + document.getElementById("username").value +
            "&&password=" + document.getElementById("password").value);
    }
