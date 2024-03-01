package FinalExam.FinalExam_04;

import java.util.*;

public class HeroesOfCode_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int nLine = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();
        for (int i = 1; i <=nLine ; i++) {
            String []addHeroes = scanner.nextLine().split(" ");
            String name = addHeroes[0];
            int hitPointHP = Integer.parseInt(addHeroes[1]);// na 0 index
            int manaPointMP = Integer.parseInt(addHeroes[2]); // na 1 index
            List<Integer> points = new ArrayList<>();
            points.add(hitPointHP);
            points.add(manaPointMP);
            heroesMap.put(name,points);
        }
        
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String [] command = input.split(" - ");
            if (input.contains("CastSpell")) {
                String heroName = command[1];
                int mpNeeded = Integer.parseInt(command[2]);
                String spellName = command[3];
                int currentMp = heroesMap.get(heroName).get(1);
                if (currentMp >= mpNeeded) {
                    int diff = currentMp - mpNeeded;
                    heroesMap.get(heroName).set(1,diff);
                    System.out.println(heroName + " has successfully cast " + spellName + " and now has " + diff + " MP!");
                }else {
                    System.out.println(heroName + " does not have enough MP to cast "+ spellName + "!");
                }
            } else if (input.contains("TakeDamage")) {
                String heroName = command[1];
                int damage = Integer.parseInt(command[2]);
                String attacker = command[3];
                int currentHP = heroesMap.get(heroName).get(0);
                int diff = currentHP - damage;
                if (diff > 0) {
                    heroesMap.get(heroName).set(0,diff);
                    System.out.println(heroName +" was hit for "+damage+" HP by "+attacker+" and now has "+diff+" HP left!");
                } else {
                    heroesMap.remove(heroName);
                    System.out.println(heroName +" has been killed by "+attacker+"!");
                }
            } else if (input.contains("Recharge")) {
                String heroName = command[1];
                int amount = Integer.parseInt(command[2]);
                int currentMp = heroesMap.get(heroName).get(1);
                if (amount + currentMp <= 200) {
                    heroesMap.get(heroName).set(1,amount + currentMp);
                    System.out.println(heroName+" recharged for "+amount+" MP!");
                } else {
                    int diff = 200-currentMp;
                    heroesMap.get(heroName).set(1,200);
                    System.out.println(heroName+" recharged for "+diff+" MP!");
                }
            } else if (input.contains("Heal")) {
                String heroName = command[1];
                int amount = Integer.parseInt(command[2]);
                int currentHP = heroesMap.get(heroName).get(0);
                if (amount + currentHP <= 100) {
                    heroesMap.get(heroName).set(0,amount + currentHP);
                    System.out.println(heroName+" healed for "+amount+" HP!");
                } else {
                  int diff = 100 - currentHP;
                    heroesMap.get(heroName).set(0,100);
                    System.out.println(heroName+" healed for "+diff+" HP!");
                }

            }

            input = scanner.nextLine();      
        }
        for (Map.Entry<String, List<Integer>> entry : heroesMap.entrySet()) {
            String name = entry.getKey();
            int HP = entry.getValue().get(0);
            int MP = entry.getValue().get(1);
            System.out.println(name);
            System.out.println(" HP: " + HP);
            System.out.println(" MP: " + MP);
        }


    }
}
