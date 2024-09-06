<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Meu primeiro formulário</title>
    <style>
        section,
        fieldset {
            margin-bottom: 8px;
        }
    </style>
</head>
<body>
    <form action="./hello" method="post">
        <fieldset>
            <legend>Dados Pessoais</legend>
            <section>
                <label for="nome">Nome completo</label>
                <input type="text" id="nome" name="nome" value="" required>
            </section>
            <section>
                <label>Sexo:</label>
                <input type="radio" name="sexo" value="M" checked>Masculino
                <input type="radio" name="sexo" value="F">Feminino
            </section>
            <section>
                <label for="email">E-mail</label>
                <input type="email" id="email" name="email" value="" required>
            </section>
            <section>
                <label for="telphone">Telefone</label>
                <input type="tel" id="telphone" name="telphone" value="" required>
            </section>
            <section>
                <label for="linkedin">LinkedIn</label>
                <input type="url" id="linkedin" name="linkedin" value="" required>
            </section>
        </fieldset>
        <fieldset>
            <legend>Formação Academica</legend>
            <section id="formacao1">
                <section>
                    <label for="formacao1-instituicao">Instituição</label>
                    <input type="text" id="formacao1-instituicao" name="formacao1-instiuicao" value="" required>
                </section>
            </section>
            <section>
                <label for="formacao1-curso">Curso</label>
                <input type="text" id="formacao1-curso" name="formacao1-curso" value="" required>
            </section>
            <section>
                <label for="formacao1-carga-horaria">Carga Horária</label>
                <input type="text" id="formacao1-carga-horaria" name="formacao1-carga-horaria" value="" required>
            </section>
            <section id="formacao2">
                <section>
                    <label for="formacao2-instituicao">Instituição</label>
                    <input type="text" id="formacao2-instituicao" name="formacao2-instituicao" value="">
                </section>
            </section>
            <section>
                <label for="formacao2-curso">Curso</label>
                <input type="text" id="formacao2-curso" name="formacao2-curso" value="">
            </section>
            <section>
                <label for="formacao2-carga-horaria">Carga Horária</label>
                <input type="text" id="formacao2-carga-horaria" name="formacao2-carga-horaria" value="">
            </section>
        </fieldset>
        <fieldset>
            <legend>Experiência Profissional</legend>
            <section>
                <section id="experiencia1">
                    <section>
                        <label for="experiencia1-empresa">Empresa</label>
                        <input type="text" id="experiencia1-empresa" name="experiencia1-empresa" value="" required>
                    </section>
                    <section>
                        <label for="experiencia1-cargo">Cargo</label>
                        <input type="text" id="experiencia1-cargo" name="experiencia1-cargo" value="" required>
                    </section>
                    <section>
                        <label for="experiencia1-nivel">Nível</label>
                        <select id="experiencia1-nivel" name="experiencia1-nivel" required>
                            <option value=""></option>
                            <option value="j">Junior</option>
                            <option value="p">Pleno</option>
                            <option value="s">Sênior</option>
                        </select>
                    </section>
                    <section>
                        <label for="experiencia1-descricao">Descrição das Atividades</label>
                        <textarea id="experiencia1-descricao" name="experiencia1-descricao" rows="5" cols="50"></textarea>
                    </section>
                </section>
                <hr>
                <section id="experiencia2">
                    <section>
                        <label for="experiencia2-empresa">Empresa</label>
                        <input type="text" id="experiencia2-empresa" name="experiencia2-empresa" value="" required>
                    </section>
                    <section>
                        <label for="experiencia1-cargo">Cargo</label>
                        <input type="text" id="experiencia2-cargo" name="experiencia2-cargo" value="" required>
                    </section>
                    <section>
                        <label for="experiencia2-nivel">Nível</label>
                        <select id="experiencia2-nivel" name="experiencia2-nivel" required>
                            <option value=""></option>
                            <option value="j">Junior</option>
                            <option value="p">Pleno</option>
                            <option value="s">Sênior</option>
                        </select>
                    </section>
                    <section>
                        <label for="experiencia2-descricao">Descrição das Atividades</label>
                        <textarea id="experiencia2-descricao" name="experiencia2-descricao" rows="5" cols="50"></textarea>
                    </section>
                </section>
            </section>
        </fieldset>
        <fieldset>
            <section>
                <button type="submit">Enviar Dados</button>
            </section>
        </fieldset>
    </form>
</body>
</html>