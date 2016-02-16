package cn.dennishucd.secondsight.filters.ar;

import cn.dennishucd.secondsight.filters.NoneFilter;

public class NoneARFilter extends NoneFilter implements ARFilter {
	@Override
	public float[] getGLPose() {
		return null;
	}
}