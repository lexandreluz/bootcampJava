# Salvando Alterações no Repositório Local

O Git é um sistema de controle de versão distribuído que permite rastrear alterações em arquivos e diretórios. É uma ferramenta poderosa que pode ser usada para gerenciar projetos de qualquer tamanho.

Para salvar alterações no repositório local, você pode usar os seguintes comandos:

- `git add [arquivo]`: Adiciona um arquivo ao índice.
- `git add .`: Adiciona todos os arquivos ao índice.
- `git commit -m "mensagem"`: Cria um novo commit com as alterações no índice.
- `git push`: Envia as alterações para o repositório remoto.

Por exemplo, para adicionar o arquivo `index.html` ao índice e criar um novo commit com a mensagem "Adicionando index.html", você usaria o seguinte comando:

`git add index.html
git commit -m "Adicionando index.html"`

Para enviar as alterações para o repositório remoto, você usaria o seguinte comando:

`git push`

Você também pode usar o comando `git stash` para salvar temporariamente as alterações no índice. Isso pode ser útil se você precisar alternar para uma branch diferente ou se precisar fechar o editor sem fazer o commit. Para armazenar as alterações no índice, use o seguinte comando:

`git stash`

Para aplicar as alterações do stash, use o seguinte comando:

`git stash pop`

Para excluir as alterações do stash, use o seguinte comando:

`git stash drop`

O Git é uma ferramenta poderosa que pode ser usada para gerenciar projetos de qualquer tamanho. Ao aprender como salvar alterações no repositório local, você pode melhorar sua produtividade e evitar perder alterações.

## **Adicionando arquivos ao índice**

O primeiro passo para salvar alterações no repositório local é adicionar os arquivos que você deseja rastrear ao índice. Isso pode ser feito usando o comando `git add`. O parâmetro `git add` aceita um nome de arquivo ou um padrão de glob. Por exemplo, para adicionar o arquivo `index.html` ao índice, você pode usar o seguinte comando:

`git add index.html`

Para adicionar todos os arquivos no diretório atual ao índice, você pode usar o seguinte comando:

`git add .`

## **Criando um commit**

Depois de adicionar os arquivos que você deseja rastrear ao índice, você pode criar um commit. Um commit é uma unidade de trabalho que contém as alterações em um ou mais arquivos. Para criar um commit, você pode usar o comando `git commit`. O parâmetro `git commit` aceita uma mensagem que descreve as alterações no commit. Por exemplo, para criar um commit que adiciona o arquivo `index.html` ao projeto, você pode usar o seguinte comando:

`git commit -m "Adicionando index.html"`

## **Enviando alterações para o repositório remoto**

Depois de criar um commit, você pode enviar as alterações para o repositório remoto. Isso pode ser feito usando o comando `git push`. O parâmetro `git push` aceita o nome do repositório remoto e o branch para o qual você deseja enviar as alterações. Por exemplo, para enviar as alterações para o repositório remoto chamado `origin` e o branch chamado `master`, você pode usar o seguinte comando:

`git push origin master`

## **Salvando alterações temporariamente**

O comando `git stash` pode ser usado para salvar as alterações no índice temporariamente. Isso pode ser útil se você precisar alternar para uma branch diferente ou se precisar fechar o editor sem fazer o commit. Para armazenar as alterações no índice, use o seguinte comando:

`git stash`

Para aplicar as alterações do stash, use o seguinte comando:

`git stash pop`

Para excluir as alterações do stash, use o seguinte comando:

`git stash drop`

## **Conclusão**

O Git é uma ferramenta poderosa que pode ser usada para gerenciar projetos de qualquer tamanho. Ao aprender como salvar alterações no repositório local, você pode melhorar sua produtividade e evitar perder alterações.

**share**

**Google it**