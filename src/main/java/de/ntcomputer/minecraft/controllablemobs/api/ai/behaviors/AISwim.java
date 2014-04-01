package de.ntcomputer.minecraft.controllablemobs.api.ai.behaviors;

import de.ntcomputer.minecraft.controllablemobs.api.ai.AIType;
import de.ntcomputer.minecraft.controllablemobs.implementation.CraftControllableMob;
import net.minecraft.server.v1_7_R1.PathfinderGoal;
import net.minecraft.server.v1_7_R1.PathfinderGoalFloat;
import org.bukkit.entity.LivingEntity;

/**
 * Very important AIBehavior that lets the entity swim.
 * Must be added if the entity should not drown when it gets into the water.
 * 
 * @author Cybran
 * @version v4
 *
 */
public class AISwim extends AIBehavior<LivingEntity> {
	
	/**
	 * Create with an automatically given priority.
	 */
	public AISwim() {
		this(0);
	}

	/**
	 * Create with a custom priority.
	 * 
	 * @param priority the priority of this behavior. Specify 0 to auto-generate it
	 */
	public AISwim(final int priority) {
		super(priority);
	}

	@Override
	public AIType getType() {
		return AIType.MOVE_SWIM;
	}

    @Override
    public PathfinderGoal createPathfinderGoal(CraftControllableMob<? extends LivingEntity> mob) {
        return new PathfinderGoalFloat(mob.nmsEntity);
    }
}
