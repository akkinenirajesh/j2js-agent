
package org.w3c.dom.svg;

import org.w3c.dom5.DOMException;

public interface SVGPoint {
  public float getX( );
  public void      setX( float x )
                       throws DOMException;
  public float getY( );
  public void      setY( float y )
                       throws DOMException;

  public SVGPoint matrixTransform ( SVGMatrix matrix );
}
