# TextInput & TextInputLayout — (Android / Kotlin)

Aplicativo Android desenvolvido em **Kotlin** e **Material Design** como parte dos exercícios de **Campos de Texto e Leitura de Dados (TextInputLayout)**. O projeto contempla múltiplos exercícios práticos com validações de entrada, formatação de dados e navegação entre telas.

## Funcionalidades & Exercícios Implementados

O aplicativo possui um **Menu Principal** que permite navegar pelos seguintes exercícios e desafios:

1. **Pedido de Lanche** (Exemplo inicial)
   - Leitura de múltiplos campos (`TextInputLayout` / `TextInputEditText`).
   - Exibição formatada do pedido do usuário.

2. **Exercício 3 — Reserva de Sala** (`ReservaSalaActivity`)
   - **Campos:** Nome do Responsável, Sala/Laboratório e Horário (`inputType="time"`).
   - **Saída:** Exibe o resultado na tela (*"Lab 3 reservado para Prof. Marcos às 19:00"*) e registra no Logcat / Terminal.

3. **Exercício 4 — Tela de Login** (`LoginComplexoActivity`)
   - **Campos:** E-mail e Senha (`textPassword` com ícone de mostrar/ocultar senha ativado via `app:endIconMode="password_toggle"`).
   - **Regra extra:** Validação de no mínimo 6 caracteres na senha (`senha.length()`).
   - **Recurso extra:** Botão **"Esqueci a senha"** que direciona para a tela de recuperação.

4. **Exercício 5 — Inscrição em Evento** (`InscricaoEventoActivity`)
   - **Campos:** Nome, E-mail e Idade (`inputType="number"`).
   - **Regra extra:** Validação de idade permitida entre 14 e 99 anos.

5. **Exercício 6 — Cadastro de Produto** (`CadastroProdutoActivity`)
   - **Campos:** Produto, Preço (`inputType="numberDecimal"`) e Quantidade (`inputType="number"`).
   - **Regra extra:** Validação de preço maior que zero e cálculo automático do valor total em estoque (`Preço × Quantidade`).

6. **Exercício 7 — Recuperar Senha** (`RecuperarSenhaActivity`)
   - **Campos:** E-mail e Confirmação de e-mail.
   - **Regra extra:** Validação se ambos os e-mails são idênticos (`email.equals(confirmacao)`).

---

© 2026 William-MC-Flores. Todos os direitos reservados.
