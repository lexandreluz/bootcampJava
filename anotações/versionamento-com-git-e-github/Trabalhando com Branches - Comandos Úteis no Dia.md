# Trabalhando com Branches - Comandos Úteis no Dia a Dia

- `git branch`: lista todos os branches existentes
- `git branch -a`: lista todos os branches, incluindo os remotos
- `git branch -r`: lista apenas os branches remotos
- `git branch -d <branch_name>`: deleta o branch especificado
- `git branch -m <old_branch_name> <new_branch_name>`: renomeia o branch especificado
- `git checkout <branch_name>`: troca para o branch especificado
- `git merge <branch_name>`: mescla o branch especificado no branch atual
- `git merge --ff-only`: mescla o branch especificado no branch atual, mas apenas se não houver conflitos
- `git merge --no-ff`: mescla o branch especificado no branch atual, mesmo que haja conflitos
- `git merge --abort`: aborta a mesclagem atual
- `git stash`: salva as alterações atuais no índice
- `git stash pop`: aplica as alterações salvas no índice
- `git stash drop`: descarta as alterações salvas no índice

Esses são apenas alguns dos muitos comandos que podem ser usados para trabalhar com branches no Git. Ao aprender esses comandos, você pode melhorar sua produtividade e evitar perder alterações.