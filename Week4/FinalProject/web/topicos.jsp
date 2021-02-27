<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

        <title>Todos os tópicos</title>
    </head>
    <body>
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <p class="fs-3 text-center fw-bold">Bem vindo, ${name}.</p>
                <p class="fs-4 text-center">Todos os tópicos</p>
                <div class="d-grid gap-2">
                    <form method="POST" action="TopicosServlet">
                        <input type="hidden" name="loginUser" value=${login}>
                        <button type="submit" class="btn btn-primary">Inserir Tópico</button>
                    </form>
                    <a type="button" class="btn btn-outline-primary" href="ranking.jsp">Ranking</a>
                </div>
                <div class="list-group">
                    <a href="#" class="list-group-item list-group-item-action" aria-current="true">
                        <div class="d-flex w-100 justify-content-between">
                            <h5 class="mb-1">título</h5>
                        </div>
                        <p class="mb-1">nome do usuário que o criou</p>
                    </a>
                    <a href="#" class="list-group-item list-group-item-action" aria-current="true">
                        <div class="d-flex w-100 justify-content-between">
                            <h5 class="mb-1">título</h5>
                        </div>
                        <p class="mb-1">nome do usuário que o criou</p>
                    </a>
                    <a href="#" class="list-group-item list-group-item-action" aria-current="true">
                        <div class="d-flex w-100 justify-content-between">
                            <h5 class="mb-1">título</h5>
                        </div>
                        <p class="mb-1">nome do usuário que o criou</p>
                    </a>
                </div>
            </div>
            <div class="col-2"></div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </body>
</html>
