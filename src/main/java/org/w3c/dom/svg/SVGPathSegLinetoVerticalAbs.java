
package org.w3c.dom.svg;

import org.w3c.dom5.DOMException;

public interface SVGPathSegLinetoVerticalAbs extends 
               SVGPathSeg {
  public float   getY( );
  public void      setY( float y )
                       throws DOMException;
}
