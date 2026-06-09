# 🐙 Meus Estudos de Git & GitHub

Este é o meu guia rápido de sobrevivência para manter o ambiente limpo, organizar meus códigos e subir meus estudos sem erros para a nuvem.

---

## 🚀 O Fluxo Perfeito do Dia a Dia (Os 5 Passos)

Sempre que for começar um novo estudo ou exercício, siga esta ordem para trabalhar de forma profissional:

1. **`git clone <link-do-repositorio>`** Tráz o projeto da internet para o seu computador (só faz uma vez por projeto).
2. **`git checkout -b nome-da-branch`** Cria uma "bolha" ou linha do tempo segura para codificar sem estragar a versão principal.  
   *⚠️ Atenção: Nunca use espaços no nome da branch! Use hífen (ex: `aplicando-estudos`).*
3. **`git add .`** Organiza o cenário e avisa ao Git quais arquivos alterados vão entrar na foto.
4. **`git commit -m "sua mensagem"`** Bate a foto oficial e salva a alteração no histórico do seu computador.
5. **`git push origin nome-da-branch`** Envia a sua branch segura lá para o site do GitHub na internet.

---

## 🛠️ Comandos de Emergência (O que me salvou)

### 🧼 Limpar o ambiente após um erro:
Se por acaso você der `git clone` no lugar errado ou o Git começar a rastrear pastas embutidas (*Embedded Repository*), use para limpar o cache:
```bash
git rm --cached -f -r .
```
### 🔍 Checar o status do ambiente:

Para ver em qual branch você está e se tem algum arquivo pendente ou modificado:
```bash
git status