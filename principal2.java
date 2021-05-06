/*
 * 		BM_CognitiveComplexity	2	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	2	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	94	double
		BM_HalsteadNumOperators	6	double
		BM_HalsteadNumUniqueOperands	34	double
		BM_HalsteadNumUniqueOperators	4	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	11	int
		BM_LinesOfComments	1	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	1	int
		BM_Size	384	long
 */
package com.arquitecturajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal2 {

	public static void main(String[] args) {

		ArrayList<Persona> milista = new ArrayList<Persona>();
		milista.add(new Persona("Miguel"));
		milista.add(new Persona("Alicia"));

		//Como podemos ver la siguiente linea de código simplifica sobre manera el programa:
		Collections.sort(milista, (Persona p1, Persona p2) -> p1.getNombre().compareTo(p2.getNombre()));

		for (Persona p : milista) {

			System.out.println(p.getNombre());

		}
	}

}
