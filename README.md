# recruitmenttasks

## Zadanie 1
Napisz program, który wypisuje liczby od 1 do 100. Ale dla wielokrotności trójki wyświetl "Fizz" zamiast
liczby oraz dla wielokrotności piątki wyświetl "Buzz". Dla liczb będących wielokrotnościami trójki oraz
piątki wyświetl "FizzBuzz".
## Zadanie 2
Napisz funkcję sprawdzającą poprawność daty w latach 2001-2099 (daty spoza tego okresu uznaj za
niepoprawne).
Wejście – trzy parametry liczbowe (dzień, miesiąc, rok).
Wyjście – parametr logiczny (true – data poprawna, false – data niepoprawna) .
Proszę zaimplementować własny algorytm kontroli – nie wolno korzystać z gotowych rozwiązań, np.
LocalDate, Calendar, itp.
## Zadanie 3
Napisz program symulujący grę w kości. W grze bierze udział dwóch graczy o nazwach: pierwszy, drugi.
Każdemu graczowi przypada 5 tur. Tury graczy odbywają się naprzemiennie tzn. grę zaczyna gracz
pierwszy, po jego turze następuje tura gracza drugiego, następna jest tura gracza pierwszego itd. Grę
zawsze rozpoczyna gracz pierwszy. Podczas każdej tury gracz zbiera punkty karne według zasad
opisanych poniżej. Suma punktów każdego gracza przed rozpoczęciem gry wynosi zero. Wygrywa
gracz, który zbierze mniejszą liczbę punktów.
W każdej turze, gracz wykonuje maksymalnie 10 rzutów dwoma kośćmi jednocześnie. Możliwe wyniki
rzutu jedną kością to jedna z następujących cyfr {1, 2, 3, 4, 5, 6}.
Zasady gry:
1. Jeżeli w pierwszym rzucie tury gracz uzyska sumę oczek z obu kości równą 7 lub 11, wygrywa turę
przed czasem (rozpoczyna się tura przeciwnika).
2. Jeżeli gracz w pierwszym rzucie tury uzyska sumę oczek z obu kości równą 2 lub 12, przegrywa turę
przed czasem (rozpoczyna się tura przeciwnika). Do punktów gracza doliczana jest maksymalna
możliwa liczba punktów karnych za turę (tyle, ile by uzyskał w najbardziej pesymistycznym
przebiegu swojej tury).
3. Jeżeli gracz uzyska sumę oczek z obu kości równą 5, wygrywa turę przed czasem (rozpoczyna się
tura przeciwnika).
4. Jeżeli gracz uzyska sumę oczek z obu kości inną niż opisane powyżej, do jego punktów doliczona
zostaje suma oczek uzyskanych w danym rzucie podzielona przez numer rzutu w danej turze.
Po zakończeniu wszystkich tur obydwu graczy na standardowe wyjście zostaje wypisany
