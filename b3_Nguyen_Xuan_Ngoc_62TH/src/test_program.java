public class test_program {
                   public static void main(String[] args) {
                                      Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
                                      System.out.println(anAuthor); // toString()
                                      anAuthor.setEmail("paul@nowhere.com");
                                      System.out.println(anAuthor); // toString()
                                      Book anBook = new Book("Java for Dummy", anAuthor, 19.95, 99);
                                      Book anotherBook = new Book("More Java for Dummy",
                                                                            new Author("Ngoc", "baitaptoan53@gmail.com",
                                                                                                                  'm'),
                                                                            29.95, 8);
                                      System.out.println(anBook); // toString()
                                      System.out.println(anotherBook); // toString()

                   }

}
