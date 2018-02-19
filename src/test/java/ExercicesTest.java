import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ExercicesTest {

    @Test
    public void string_concatenation() throws Exception {
        //given
        List<String> inputString = Arrays.asList("a", "b", "b", "c", "d");
        String expectdResult = "abbcd";

        //when
        String actualResult = Exercices.exercice1(inputString);

        //then
        assertThat(actualResult).isEqualTo(expectdResult);
    }

    @Test
    public void classe_nombres_du_plus_petit_au_plus_grand() throws Exception {
        //given
        List<Integer> listeDesordre = Arrays.asList(5, 2, 9, 8, 8, 6, 7);
        List<Integer> listeOrdre = Arrays.asList(2, 5, 6, 7, 8, 8, 9);

        //when
        List<Integer> listeResultat = Exercices.exercice2(listeDesordre);

        //then
        assertThat(listeResultat).isEqualTo(listeOrdre);
    }

    @Test
    public void classe_mots_du_plus_petit_au_plus_grand() throws Exception {
        //given
        List<String> listeDesordre = Arrays.asList("999999999", "55555", "1", "1", "22", "333", "666666");
        List<String> listeOrdre = Arrays.asList("1", "1", "22", "333", "55555", "666666", "999999999");

        //when
        List<String> listeResultat = Exercices.exercice3(listeDesordre);

        //then
        assertThat(listeResultat).isEqualTo(listeOrdre);
    }

    @Test
    public void recupere_tout_les_mots_commencant_par_la_lettre_a() throws Exception {
        //given
        List<String> listeDeMots = Arrays.asList("a", "b", "ana", "banana", "", "zzzzazzz", "1", "asftref");
        List<String> listeDesMotsCommancantPar_a = Arrays.asList("a", "ana", "asftref");
        //when
        List<String> listeResultat = Exercices.exercice4(listeDeMots);

        //then
        assertThat(listeResultat).containsExactlyInAnyOrder(listeDesMotsCommancantPar_a.toArray(new String[0]));
    }
}
