package de.mpicbg.ulman.Mastodon.auxPlugins.TRAMarkers;

import net.imglib2.util.Util;
import net.imglib2.RealLocalizable;
import de.mpicbg.ulman.Mastodon.auxPlugins.TRAMarkersProvider;

public class SpheresWithFloatingRadius implements TRAMarkersProvider.intersectionDecidable
{
	@Override
	public void setHalfBBoxInterval(final double[] halfBBoxSize, final double radius)
	{
		halfBBoxSize[0] = radius;
		halfBBoxSize[1] = radius;
		halfBBoxSize[2] = radius;
	}

	@Override
	public boolean isInside(final RealLocalizable pos, final RealLocalizable centre, final double radius)
	{
		return Util.distance(pos,centre) <= radius;
	}

	@Override
	public String printInfo()
	{
		return "Sphere with radius decided by each spot individually";
	}
}
