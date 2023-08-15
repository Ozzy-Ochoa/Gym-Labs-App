# Gym Labs

<sup>
Este es um aplicativo com finalidade de gerenciar treinos, nutrição e dar informações/dicas sobre outros temas associados à "Academia" para gerenciar treinos e nutrição na palma da sua mão.
</sup>

---

<details><summary> O que achamos neste Aplicativo?: </summary>

<p>

> - [ ] **Registro.**
>       
> - [ ] **Inicio de Seção.**
>       
> - [ ] **Wiki.**
>       
> - [ ] **Treinos.**
>       
> - [ ] **Nutrição.**
>       
> - [ ] **Espaço Empresa.**
>       
> - [ ] **Perfis.**
>       
> - [ ] **Planos.**
>       
> - [ ] **Espaço Administrador.**


</p>

</details>

---

<details>
<summary> Conteúdo da Wiki </summary>

| Wiki | Conteúdo |
|-----:|-----------|
|     1| *Nutrição*  |
|     2| *Anatomia*  |
|     3| *Dicas* |
|     4| *Novos planos* |
|     5| *Atualizações do app* | 

</details>

### Avance do app:

```docker
version: '0.1.0'
services:
    GymLabs:
        container_name: AoAssistant
        environment:
            - mysqlUser=aoassisnant
            - mysqlPass=MY_SUPER_SECRET_MYSQL_PASSWORD
            - mysqlHost=mysql
            - mysqlPort=3306
            - mysqldb=albionAssistant
            - TOKEN=MY_SUPER_SECRET_TOKEN
        restart: always
        image: 'aoassistant:latest'
```
