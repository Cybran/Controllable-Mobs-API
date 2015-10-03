package de.ntcomputer.minecraft.controllablemobs.implementation.nativeinterfaces.server;

import java.util.Collections;
import java.util.List;

import com.google.common.base.Predicate;

import net.minecraft.server.v1_8_R3.AxisAlignedBB;
import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.World;
import de.ntcomputer.minecraft.controllablemobs.implementation.nativeinterfaces.system.NativeMethodPublic;

public class NmsWorld {
	public final SearchEntities METHOD_SEARCHENTITIES = new SearchEntities();
	
	public class SearchEntities extends NativeMethodPublic {
		public <E extends Entity> List<E> invoke(World world, Class<E> classLookingFor, AxisAlignedBB area, Predicate<Entity> entitySelector) {
			try {
				return world.a(classLookingFor, area, entitySelector);
			} catch(Throwable e) {
				this.handleException(e);
				return Collections.emptyList();
			}
		}
	}

}
