// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scenegraph.proxies;

/**
 * var ground = BABYLON.MeshBuilder.CreateGroundFromHeightMap("gdhm", url, {width: 6, subdivisions: 4}, scene);
 * 
 * option 	value 	default value
 * width 	(number) size of the map width 	10
 * height 	(number) size of the map height 	10
 * subdivisions 	(number) number of map subdivisions 	1
 * minHeight 	(number) minimum altitude 	0
 * maxHeigth 	(number) maximum altitude 	1
 * onReady 	(function) a callback js function that is called and passed the just built mesh 	(mesh) => {return;}
 * updatable 	(boolean) true if the mesh is updatable 	false
 */
public class HeightMapGround extends scenegraph.proxies.Primitive
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SceneGraph.HeightMapGround";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		doublesided("doublesided"),
		width("width"),
		height("height"),
		subdivisions("subdivisions"),
		Name("Name"),
		x("x"),
		y("y"),
		z("z"),
		rotx("rotx"),
		roty("roty"),
		rotz("rotz"),
		visible("visible"),
		color("color"),
		HeightMap("SceneGraph.HeightMap"),
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

	public HeightMapGround(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SceneGraph.HeightMapGround"));
	}

	protected HeightMapGround(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject heightMapGroundMendixObject)
	{
		super(context, heightMapGroundMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SceneGraph.HeightMapGround", heightMapGroundMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SceneGraph.HeightMapGround");
	}

	/**
	 * @deprecated Use 'HeightMapGround.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static scenegraph.proxies.HeightMapGround initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return scenegraph.proxies.HeightMapGround.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static scenegraph.proxies.HeightMapGround initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new scenegraph.proxies.HeightMapGround(context, mendixObject);
	}

	public static scenegraph.proxies.HeightMapGround load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return scenegraph.proxies.HeightMapGround.initialize(context, mendixObject);
	}

	public static java.util.List<scenegraph.proxies.HeightMapGround> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<scenegraph.proxies.HeightMapGround> result = new java.util.ArrayList<scenegraph.proxies.HeightMapGround>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SceneGraph.HeightMapGround" + xpathConstraint))
			result.add(scenegraph.proxies.HeightMapGround.initialize(context, obj));
		return result;
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

	/**
	 * @return value of width
	 */
	public final java.lang.Double getwidth()
	{
		return getwidth(getContext());
	}

	/**
	 * @param context
	 * @return value of width
	 */
	public final java.lang.Double getwidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.width.toString());
	}

	/**
	 * Set value of width
	 * @param width
	 */
	public final void setwidth(java.lang.Double width)
	{
		setwidth(getContext(), width);
	}

	/**
	 * Set value of width
	 * @param context
	 * @param width
	 */
	public final void setwidth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double width)
	{
		getMendixObject().setValue(context, MemberNames.width.toString(), width);
	}

	/**
	 * @return value of height
	 */
	public final java.lang.Double getheight()
	{
		return getheight(getContext());
	}

	/**
	 * @param context
	 * @return value of height
	 */
	public final java.lang.Double getheight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.height.toString());
	}

	/**
	 * Set value of height
	 * @param height
	 */
	public final void setheight(java.lang.Double height)
	{
		setheight(getContext(), height);
	}

	/**
	 * Set value of height
	 * @param context
	 * @param height
	 */
	public final void setheight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double height)
	{
		getMendixObject().setValue(context, MemberNames.height.toString(), height);
	}

	/**
	 * @return value of subdivisions
	 */
	public final java.lang.Integer getsubdivisions()
	{
		return getsubdivisions(getContext());
	}

	/**
	 * @param context
	 * @return value of subdivisions
	 */
	public final java.lang.Integer getsubdivisions(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.subdivisions.toString());
	}

	/**
	 * Set value of subdivisions
	 * @param subdivisions
	 */
	public final void setsubdivisions(java.lang.Integer subdivisions)
	{
		setsubdivisions(getContext(), subdivisions);
	}

	/**
	 * Set value of subdivisions
	 * @param context
	 * @param subdivisions
	 */
	public final void setsubdivisions(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer subdivisions)
	{
		getMendixObject().setValue(context, MemberNames.subdivisions.toString(), subdivisions);
	}

	/**
	 * @return value of HeightMap
	 */
	public final scenegraph.proxies.Image getHeightMap() throws com.mendix.core.CoreException
	{
		return getHeightMap(getContext());
	}

	/**
	 * @param context
	 * @return value of HeightMap
	 */
	public final scenegraph.proxies.Image getHeightMap(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		scenegraph.proxies.Image result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.HeightMap.toString());
		if (identifier != null)
			result = scenegraph.proxies.Image.load(context, identifier);
		return result;
	}

	/**
	 * Set value of HeightMap
	 * @param heightmap
	 */
	public final void setHeightMap(scenegraph.proxies.Image heightmap)
	{
		setHeightMap(getContext(), heightmap);
	}

	/**
	 * Set value of HeightMap
	 * @param context
	 * @param heightmap
	 */
	public final void setHeightMap(com.mendix.systemwideinterfaces.core.IContext context, scenegraph.proxies.Image heightmap)
	{
		if (heightmap == null)
			getMendixObject().setValue(context, MemberNames.HeightMap.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.HeightMap.toString(), heightmap.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final scenegraph.proxies.HeightMapGround that = (scenegraph.proxies.HeightMapGround) obj;
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
		return "SceneGraph.HeightMapGround";
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