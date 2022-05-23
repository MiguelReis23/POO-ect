package Aula05.Ex5;

import Aula05.Ex4.Book;
import Aula05.Ex4.User;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book catalog[] = new Book[10];
        User users[] = new User[100000];
        int op;
        int Nusers = 0;
        int Nbooks = 0;

        do {

            System.out.println("1 - Inscrever utilizador");
            System.out.println("2 - remover utilizador");
            System.out.println("3 - imprimir lista de utilizadores");
            System.out.println("4 - registar um novo livro");
            System.out.println("5 - imprimir lista de livros");
            System.out.println("6 - emprestar");
            System.out.println("7 - devolver");
            System.out.println("8 - sair");
            System.out.print("Escolha uma opçao: ");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Nome: ");
                    String name = sc.next();
                    System.out.print("Nº Mecanografico: ");
                    int Nmec = sc.nextInt();
                    System.out.print("Introduza o curso: ");
                    String course = sc.next();
                    users[Nusers++] = new User(name, Nmec, course);
                    break;

                case 2:
                    System.out.print("Introduza o Nº Mecanografico: ");
                    int Nmec2 = sc.nextInt();
                    int i = 0;
                    boolean found = false;

                    while (i < Nusers && !found) {
                        if (users[i].getNmec() == Nmec2) {
                            found = true;
                            users[i] = null;
                        }
                        i++;
                    }
                    if (!found)
                        System.out.println("Nº Mecanografico nao encontrado");
                    break;

                case 3:

                    for (int j = 0; j < Nusers; j++) {
                        if (users[j] != null)
                            System.out.println(users[j]);
                    }
                    break;

                case 4:

                    System.out.print("Introduza o titulo: ");
                    String title = sc.next();
                    System.out.print("Introduza o tipo de empréstimo: ");
                    String loanType = sc.next();

                    catalog[Nbooks++] = new Book(title, loanType);
                    break;

                case 5:

                    for (int j = 0; j < Nbooks; j++) {
                        if (catalog[j] != null)
                            System.out.println(catalog[j]);
                    }
                    break;

                case 6:

                    System.out.print("Introduza o Nº Mecanografico: ");
                    int Nmec3 = sc.nextInt();
                    System.out.print("Introduza o ID do livro: ");
                    int id = sc.nextInt();

                    User user = getUser(Nmec3, users, Nusers);
                    Book book = getBook(id, catalog, Nbooks);

                    if (user != null && book != null) {
                        if (book.isLoaned()) {
                            System.out.println("O livro ja esta emprestado");
                        } else {
                            if (user.getBooks() != null && user.getBooks().size() >= 3) {
                                System.out.println("Utilizador já possui 3 livros emprestados.");
                            } else {
                                user.addbook(book.getId());
                                book.setIsLoaned(true);
                                System.out.println("Livro emprestado com sucesso.");
                            }
                        }
                    } else {
                        System.out.println("Número mec. ou id de livro inválidos.");

                    }
                    break;

                case 7:
                    System.out.print("Introduza o Nº Mecanografico: ");
                    int nMec4 = sc.nextInt();
                    System.out.print("Introduza o ID do livro: ");
                    int id2 = sc.nextInt();

                    User user2 = getUser(nMec4, users, Nusers);
                    Book book2 = getBook(id2, catalog, Nbooks);

                    if (user2 != null && book2 != null) {
                        if (!book2.isLoaned()) {
                            System.out.println("Livro nao emprestado.");
                        } else {
                            if (!user2.hasbook(book2.getId())) {
                                System.out.println("Livro nao emprestado ao utilizador.");
                            } else {
                                user2.removebook(book2.getId());
                                book2.setIsLoaned(false);
                                System.out.println("Livro devolvido com sucesso.");
                            }
                        }
                    } else {
                        System.out.println("Número mec. ou id de livro inválidos.");
                    }
                    break;
                case 8:
                    break;
            }

        } while (op != 8);
        sc.close();

    }

    public static User getUser(int nMec, User users[], int nUsers) {
        int i = 0;
        boolean found = false;

        while (i < nUsers && !found) {
            if (users[i].getNmec() == nMec) {
                found = true;
                return users[i];
            }
            i++;
        }

        return null;
    }

    public static Book getBook(int id, Book catalog[], int nBooks) {
        int i = 0;
        boolean found = false;

        while (i < nBooks && !found) {
            if (catalog[i].getId() == id) {
                found = true;
                return catalog[i];
            }
            i++;
        }

        return null;
    }
}
