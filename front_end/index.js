function autenticar(){
    // Pega os valores de input
    var txtEmail = document.getElementById("txtEmail").value;
    var txtSenha = document.getElementById("txtSenha").value;
    // Exibir inserção na console
    console.log("Digitou = "+txtEmail+" / "+txtSenha);

    var msgBody = {
        email : txtEmail,
        senha : txtSenha
    }

    var cabecalho = {
        method : "POST",
        body : JSON.stringify(msgBody),
        headers : {
            "Content-type":"application/json"
        }
    }
    fetch("http://localhost:8088/login", cabecalho)
        .then(res => trataResposta(res));
}
function trataResposta(res){
    if (res.status == 200){
        document.getElementById("msgERRO").innerHTML = "<h3>Conectado com Sucesso !<h3>";
    }
    else if (res.status == 401){
        document.getElementById("msgERRO").innerHTML = "<h3>Senha inválida<h3>";
    }
    else if (res.status == 404){
        document.getElementById("msgERRO").innerHTML = "<h3>Usuário desconhecido<h3>";
    }
}
function logar(objeto){
    // agora a idéia é armazenar o objeto do usuário recebido na resposta dentro do
    // armazenamento interno do browser

    // em um sistema real eu não armazeno o objeto, mas um TOKEN

    var objSTR = JSON.stringify(objeto);           // converti o objeto pra uma string
    localStorage.setItem("ScheduleUSER",objSTR);   // armazenei no local storage
    window.location = "home.html";                 // vou pra página principal
}