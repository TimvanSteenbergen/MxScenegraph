// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scenegraph.proxies;

public class Knot extends scenegraph.proxies.Primitive
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SceneGraph.Knot";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		radius("radius"),
		tube("tube"),
		radialSegments("radialSegments"),
		tubularSegments("tubularSegments"),
		p("p"),
		q("q"),
		doublesided("doublesided"),
		Name("Name"),
		x("x"),
		y("y"),
		z("z"),
		rotx("rotx"),
		roty("roty"),
		rotz("rotz"),
		visible("visible"),
		color("color"),
		Primitive_Node("SceneGraph.Primitive_Node"),
		Selected("SceneGraph.Selected"),
		Texture("SceneGraph.Texture");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Knot(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SceneGraph.Knot"));
	}

	protected Knot(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject knotMendixObject)
	{
		super(context, knotMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SceneGraph.Knot", knotMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SceneGraph.Knot");
	}

	/**
	 * @deprecated Use 'Knot.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static scenegraph.proxies.Knot initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return scenegraph.proxies.Knot.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static scenegraph.proxies.Knot initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new scenegraph.proxies.Knot(context, mendixObject);
	}

	public static scenegraph.proxies.Knot load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return scenegraph.proxies.Knot.initialize(context, mendixObject);
	}

	public static java.util.List<scenegraph.proxies.Knot> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<scenegraph.proxies.Knot> result = new java.util.ArrayList<scenegraph.proxies.Knot>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SceneGraph.Knot" + xpathConstraint))
			result.add(scenegraph.proxies.Knot.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of radius
	 */
	public final java.lang.Double getradius()
	{
		return getradius(getContext());
	}

	/**
	 * @param context
	 * @return value of radius
	 */
	public final java.lang.Double getradius(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.radius.toString());
	}

	/**
	 * Set value of radius
	 * @param radius
	 */
	public final void setradius(java.lang.Double radius)
	{
		setradius(getContext(), radius);
	}

	/**
	 * Set value of radius
	 * @param context
	 * @param radius
	 */
	public final void setradius(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double radius)
	{
		getMendixObject().setValue(context, MemberNames.radius.toString(), radius);
	}

	/**
	 * @return value of tube
	 */
	public final java.lang.Double gettube()
	{
		return gettube(getContext());
	}

	/**
	 * @param context
	 * @return value of tube
	 */
	public final java.lang.Double gettube(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.tube.toString());
	}

	/**
	 * Set value of tube
	 * @param tube
	 */
	public final void settube(java.lang.Double tube)
	{
		settube(getContext(), tube);
	}

	/**
	 * Set value of tube
	 * @param context
	 * @param tube
	 */
	public final void settube(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double tube)
	{
		getMendixObject().setValue(context, MemberNames.tube.toString(), tube);
	}

	/**
	 * @return value of radialSegments
	 */
	public final java.lang.Integer getradialSegments()
	{
		return getradialSegments(getContext());
	}

	/**
	 * @param context
	 * @return value of radialSegments
	 */
	public final java.lang.Integer getradialSegments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.radialSegments.toString());
	}

	/**
	 * Set value of radialSegments
	 * @param radialsegments
	 */
	public final void setradialSegments(java.lang.Integer radialsegments)
	{
		setradialSegments(getContext(), radialsegments);
	}

	/**
	 * Set value of radialSegments
	 * @param context
	 * @param radialsegments
	 */
	public final void setradialSegments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer radialsegments)
	{
		getMendixObject().setValue(context, MemberNames.radialSegments.toString(), radialsegments);
	}

	/**
	 * @return value of tubularSegments
	 */
	public final java.lang.Integer gettubularSegments()
	{
		return gettubularSegments(getContext());
	}

	/**
	 * @param context
	 * @return value of tubularSegments
	 */
	public final java.lang.Integer gettubularSegments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.tubularSegments.toString());
	}

	/**
	 * Set value of tubularSegments
	 * @param tubularsegments
	 */
	public final void settubularSegments(java.lang.Integer tubularsegments)
	{
		settubularSegments(getContext(), tubularsegments);
	}

	/**
	 * Set value of tubularSegments
	 * @param context
	 * @param tubularsegments
	 */
	public final void settubularSegments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer tubularsegments)
	{
		getMendixObject().setValue(context, MemberNames.tubularSegments.toString(), tubularsegments);
	}

	/**
	 * @return value of p
	 */
	public final java.lang.Integer getp()
	{
		return getp(getContext());
	}

	/**
	 * @param context
	 * @return value of p
	 */
	public final java.lang.Integer getp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.p.toString());
	}

	/**
	 * Set value of p
	 * @param p
	 */
	public final void setp(java.lang.Integer p)
	{
		setp(getContext(), p);
	}

	/**
	 * Set value of p
	 * @param context
	 * @param p
	 */
	public final void setp(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer p)
	{
		getMendixObject().setValue(context, MemberNames.p.toString(), p);
	}

	/**
	 * @return value of q
	 */
	public final java.lang.Integer getq()
	{
		return getq(getContext());
	}

	/**
	 * @param context
	 * @return value of q
	 */
	public final java.lang.Integer getq(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.q.toString());
	}

	/**
	 * Set value of q
	 * @param q
	 */
	public final void setq(java.lang.Integer q)
	{
		setq(getContext(), q);
	}

	/**
	 * Set value of q
	 * @param context
	 * @param q
	 */
	public final void setq(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer q)
	{
		getMendixObject().setValue(context, MemberNames.q.toString(), q);
	}

	/**
	 * @return value of doublesided
	 */
	public final java.lang.Boolean getdoublesided()
	{
		return getdoublesided(getContext());
	}

	/**
	 * @param context
	 * @return value of doublesided
	 */
	public final java.lang.Boolean getdoublesided(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.doublesided.toString());
	}

	/**
	 * Set value of doublesided
	 * @param doublesided
	 */
	public final void setdoublesided(java.lang.Boolean doublesided)
	{
		setdoublesided(getContext(), doublesided);
	}

	/**
	 * Set value of doublesided
	 * @param context
	 * @param doublesided
	 */
	public final void setdoublesided(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean doublesided)
	{
		getMendixObject().setValue(context, MemberNames.doublesided.toString(), doublesided);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final scenegraph.proxies.Knot that = (scenegraph.proxies.Knot) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SceneGraph.Knot";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
