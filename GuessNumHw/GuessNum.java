//GuessingGame kısmı
class GuessNum {
    int targetNumber;
    int attempts;
    boolean guessCorrect;

    public GuessNum(int targetNumber) {
        this.targetNumber = targetNumber;
        this.attempts = 0;
        this.guessCorrect = false;
    }

    public void startGame() throws Exception {
        System.out.println("1 ile 100 arasında bir sayı tahmin edin.");

        while (!guessCorrect) {
            System.out.print("Tahminini gir: ");
            int guess = 0;
            int c;
            boolean validInput = true;
            
            // Girdi sadece sayılar olacak ve 'Enter' ile girişi sonlandırdım 
            while ((c = System.in.read()) != '\n') {
                if (c >= '0' && c <= '9') {
                    guess = guess * 10 + (c - '0');
                } else if (c == '-' && guess == 0) { 
                    guess = -1;
                    break;
                } else {
                    validInput = false;
                }
            }
            
            if (!validInput) {
                System.out.println("Sadece sayı girin!");
                continue;
            }

            if (guess == -1) {
                System.out.println("Oyundan çıkıyorsun. Hedef sayı: " + targetNumber);
                break;
            }

            attempts++;

            if (guess == targetNumber) {
                System.out.println("Aferin! Toplam " + attempts + " tahminde bildin");
                guessCorrect = true;
            } else if (guess > targetNumber) {
                System.out.println("Çok büyük tahmin ettin! daha küçük bir sayı dene");
            } else {
                System.out.println("Çok küçük tahmin ettin! daha büyük bir sayı dene");
            }
        }
    }
}
