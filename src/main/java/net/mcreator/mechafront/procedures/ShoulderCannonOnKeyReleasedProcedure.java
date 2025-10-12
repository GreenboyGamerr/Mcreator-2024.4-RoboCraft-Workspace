package net.mcreator.mechafront.procedures;

import net.mcreator.mechafront.network.MechafrontModVariables;

public class ShoulderCannonOnKeyReleasedProcedure {
	public static void execute() {
		MechafrontModVariables.flight = 0;
	}
}
