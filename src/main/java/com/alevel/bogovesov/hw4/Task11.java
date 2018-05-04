package com.alevel.bogovesov.hw4;

/*
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую
неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от
000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте
сколько счастливых билетов в одном рулоне?
 */

public class Task11 {
    public static void main(String[] args) {

        int counterLuckyBilet = 0;
        for (int i = 1000; i <= 999999; i++) {

            int counterSum1 = 0, counterSum2 = 0;
            int sum1 = 0, sum2 = 0, number = i;
            boolean flag = false;

            do {
                if (number > 9) {

                    if (counterSum1 < 3) {
                        sum1 += (number % 10);
                        counterSum1++;
                    } else if (counterSum2 < 3) {
                        sum2 += (number % 10);
                        counterSum2++;
                    }

                    if (number > 10) {
                        number /= 10;

                        if (number < 10) {
                            if (counterSum1 < 3) {
                                sum1 += number;
                            } else if (counterSum2 < 3) {
                                sum2 += number;
                            }
                            flag = true;
                        }

                    } else {
                        if (counterSum1 < 3) {
                            sum1 += 1;
                        } else if (counterSum2 < 3) {
                            sum2 += 1;
                        }
                        flag = true;
                    }
                } else {
                    sum1 = number;
                    flag = true;
                }
            } while (!flag);

            if (sum1 == sum2) {
                counterLuckyBilet++;
                System.out.println("Lucky ticket: " + i + " sum1: " + sum1 + " sum2: " + sum2);
            }
        }

        System.out.println("Count lucky ticket: " + counterLuckyBilet);
    }
}
