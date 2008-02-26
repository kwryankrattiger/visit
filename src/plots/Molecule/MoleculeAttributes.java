// ***************************************************************************
//
// Copyright (c) 2000 - 2008, Lawrence Livermore National Security, LLC
// Produced at the Lawrence Livermore National Laboratory
// LLNL-CODE-400142
// All rights reserved.
//
// This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
// full copyright notice is contained in the file COPYRIGHT located at the root
// of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
//
// Redistribution  and  use  in  source  and  binary  forms,  with  or  without
// modification, are permitted provided that the following conditions are met:
//
//  - Redistributions of  source code must  retain the above  copyright notice,
//    this list of conditions and the disclaimer below.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
//    documentation and/or other materials provided with the distribution.
//  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
//    be used to endorse or promote products derived from this software without
//    specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
// ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
// LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
// DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
// SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
// CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
// LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
// OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
// DAMAGE.
//
// ***************************************************************************

package llnl.visit.plots;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;
import llnl.visit.ColorAttribute;

// ****************************************************************************
// Class: MoleculeAttributes
//
// Purpose:
//    This class contains the plot attributes for the molecule plot.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Mon Feb 25 15:34:40 PST 2008
//
// Modifications:
//   
// ****************************************************************************

public class MoleculeAttributes extends AttributeSubject implements Plugin
{
    // Enum values
    public final static int ATOMRENDERINGMODE_NOATOMS = 0;
    public final static int ATOMRENDERINGMODE_SPHEREATOMS = 1;
    public final static int ATOMRENDERINGMODE_IMPOSTERATOMS = 2;

    public final static int RADIUSTYPE_FIXED = 0;
    public final static int RADIUSTYPE_COVALENT = 1;
    public final static int RADIUSTYPE_ATOMIC = 2;
    public final static int RADIUSTYPE_VARIABLE = 3;

    public final static int BONDCOLORINGMODE_COLORBYATOM = 0;
    public final static int BONDCOLORINGMODE_SINGLECOLOR = 1;

    public final static int BONDRENDERINGMODE_NOBONDS = 0;
    public final static int BONDRENDERINGMODE_LINEBONDS = 1;
    public final static int BONDRENDERINGMODE_CYLINDERBONDS = 2;

    public final static int DETAILLEVEL_LOW = 0;
    public final static int DETAILLEVEL_MEDIUM = 1;
    public final static int DETAILLEVEL_HIGH = 2;
    public final static int DETAILLEVEL_SUPER = 3;


    public MoleculeAttributes()
    {
        super(22);

        drawAtomsAs = ATOMRENDERINGMODE_SPHEREATOMS;
        scaleRadiusBy = RADIUSTYPE_FIXED;
        drawBondsAs = BONDRENDERINGMODE_CYLINDERBONDS;
        colorBonds = BONDCOLORINGMODE_COLORBYATOM;
        bondSingleColor = new ColorAttribute(128, 128, 128);
        radiusVariable = new String("Default");
        radiusScaleFactor = 1f;
        radiusFixed = 0.3f;
        atomSphereQuality = DETAILLEVEL_MEDIUM;
        bondCylinderQuality = DETAILLEVEL_MEDIUM;
        bondRadius = 0.12f;
        bondLineWidth = 0;
        bondLineStyle = 0;
        elementColorTable = new String("cpk_jmol");
        residueTypeColorTable = new String("amino_shapely");
        residueSequenceColorTable = new String("Default");
        continuousColorTable = new String("Default");
        legendFlag = true;
        minFlag = false;
        scalarMin = 0f;
        maxFlag = false;
        scalarMax = 1f;
    }

    public MoleculeAttributes(MoleculeAttributes obj)
    {
        super(22);

        drawAtomsAs = obj.drawAtomsAs;
        scaleRadiusBy = obj.scaleRadiusBy;
        drawBondsAs = obj.drawBondsAs;
        colorBonds = obj.colorBonds;
        bondSingleColor = new ColorAttribute(obj.bondSingleColor);
        radiusVariable = new String(obj.radiusVariable);
        radiusScaleFactor = obj.radiusScaleFactor;
        radiusFixed = obj.radiusFixed;
        atomSphereQuality = obj.atomSphereQuality;
        bondCylinderQuality = obj.bondCylinderQuality;
        bondRadius = obj.bondRadius;
        bondLineWidth = obj.bondLineWidth;
        bondLineStyle = obj.bondLineStyle;
        elementColorTable = new String(obj.elementColorTable);
        residueTypeColorTable = new String(obj.residueTypeColorTable);
        residueSequenceColorTable = new String(obj.residueSequenceColorTable);
        continuousColorTable = new String(obj.continuousColorTable);
        legendFlag = obj.legendFlag;
        minFlag = obj.minFlag;
        scalarMin = obj.scalarMin;
        maxFlag = obj.maxFlag;
        scalarMax = obj.scalarMax;

        SelectAll();
    }

    public boolean equals(MoleculeAttributes obj)
    {
        // Create the return value
        return ((drawAtomsAs == obj.drawAtomsAs) &&
                (scaleRadiusBy == obj.scaleRadiusBy) &&
                (drawBondsAs == obj.drawBondsAs) &&
                (colorBonds == obj.colorBonds) &&
                (bondSingleColor == obj.bondSingleColor) &&
                (radiusVariable == obj.radiusVariable) &&
                (radiusScaleFactor == obj.radiusScaleFactor) &&
                (radiusFixed == obj.radiusFixed) &&
                (atomSphereQuality == obj.atomSphereQuality) &&
                (bondCylinderQuality == obj.bondCylinderQuality) &&
                (bondRadius == obj.bondRadius) &&
                (bondLineWidth == obj.bondLineWidth) &&
                (bondLineStyle == obj.bondLineStyle) &&
                (elementColorTable == obj.elementColorTable) &&
                (residueTypeColorTable == obj.residueTypeColorTable) &&
                (residueSequenceColorTable == obj.residueSequenceColorTable) &&
                (continuousColorTable == obj.continuousColorTable) &&
                (legendFlag == obj.legendFlag) &&
                (minFlag == obj.minFlag) &&
                (scalarMin == obj.scalarMin) &&
                (maxFlag == obj.maxFlag) &&
                (scalarMax == obj.scalarMax));
    }

    public String GetName() { return "Molecule"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetDrawAtomsAs(int drawAtomsAs_)
    {
        drawAtomsAs = drawAtomsAs_;
        Select(0);
    }

    public void SetScaleRadiusBy(int scaleRadiusBy_)
    {
        scaleRadiusBy = scaleRadiusBy_;
        Select(1);
    }

    public void SetDrawBondsAs(int drawBondsAs_)
    {
        drawBondsAs = drawBondsAs_;
        Select(2);
    }

    public void SetColorBonds(int colorBonds_)
    {
        colorBonds = colorBonds_;
        Select(3);
    }

    public void SetBondSingleColor(ColorAttribute bondSingleColor_)
    {
        bondSingleColor = bondSingleColor_;
        Select(4);
    }

    public void SetRadiusVariable(String radiusVariable_)
    {
        radiusVariable = radiusVariable_;
        Select(5);
    }

    public void SetRadiusScaleFactor(float radiusScaleFactor_)
    {
        radiusScaleFactor = radiusScaleFactor_;
        Select(6);
    }

    public void SetRadiusFixed(float radiusFixed_)
    {
        radiusFixed = radiusFixed_;
        Select(7);
    }

    public void SetAtomSphereQuality(int atomSphereQuality_)
    {
        atomSphereQuality = atomSphereQuality_;
        Select(8);
    }

    public void SetBondCylinderQuality(int bondCylinderQuality_)
    {
        bondCylinderQuality = bondCylinderQuality_;
        Select(9);
    }

    public void SetBondRadius(float bondRadius_)
    {
        bondRadius = bondRadius_;
        Select(10);
    }

    public void SetBondLineWidth(int bondLineWidth_)
    {
        bondLineWidth = bondLineWidth_;
        Select(11);
    }

    public void SetBondLineStyle(int bondLineStyle_)
    {
        bondLineStyle = bondLineStyle_;
        Select(12);
    }

    public void SetElementColorTable(String elementColorTable_)
    {
        elementColorTable = elementColorTable_;
        Select(13);
    }

    public void SetResidueTypeColorTable(String residueTypeColorTable_)
    {
        residueTypeColorTable = residueTypeColorTable_;
        Select(14);
    }

    public void SetResidueSequenceColorTable(String residueSequenceColorTable_)
    {
        residueSequenceColorTable = residueSequenceColorTable_;
        Select(15);
    }

    public void SetContinuousColorTable(String continuousColorTable_)
    {
        continuousColorTable = continuousColorTable_;
        Select(16);
    }

    public void SetLegendFlag(boolean legendFlag_)
    {
        legendFlag = legendFlag_;
        Select(17);
    }

    public void SetMinFlag(boolean minFlag_)
    {
        minFlag = minFlag_;
        Select(18);
    }

    public void SetScalarMin(float scalarMin_)
    {
        scalarMin = scalarMin_;
        Select(19);
    }

    public void SetMaxFlag(boolean maxFlag_)
    {
        maxFlag = maxFlag_;
        Select(20);
    }

    public void SetScalarMax(float scalarMax_)
    {
        scalarMax = scalarMax_;
        Select(21);
    }

    // Property getting methods
    public int            GetDrawAtomsAs() { return drawAtomsAs; }
    public int            GetScaleRadiusBy() { return scaleRadiusBy; }
    public int            GetDrawBondsAs() { return drawBondsAs; }
    public int            GetColorBonds() { return colorBonds; }
    public ColorAttribute GetBondSingleColor() { return bondSingleColor; }
    public String         GetRadiusVariable() { return radiusVariable; }
    public float          GetRadiusScaleFactor() { return radiusScaleFactor; }
    public float          GetRadiusFixed() { return radiusFixed; }
    public int            GetAtomSphereQuality() { return atomSphereQuality; }
    public int            GetBondCylinderQuality() { return bondCylinderQuality; }
    public float          GetBondRadius() { return bondRadius; }
    public int            GetBondLineWidth() { return bondLineWidth; }
    public int            GetBondLineStyle() { return bondLineStyle; }
    public String         GetElementColorTable() { return elementColorTable; }
    public String         GetResidueTypeColorTable() { return residueTypeColorTable; }
    public String         GetResidueSequenceColorTable() { return residueSequenceColorTable; }
    public String         GetContinuousColorTable() { return continuousColorTable; }
    public boolean        GetLegendFlag() { return legendFlag; }
    public boolean        GetMinFlag() { return minFlag; }
    public float          GetScalarMin() { return scalarMin; }
    public boolean        GetMaxFlag() { return maxFlag; }
    public float          GetScalarMax() { return scalarMax; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteInt(drawAtomsAs);
        if(WriteSelect(1, buf))
            buf.WriteInt(scaleRadiusBy);
        if(WriteSelect(2, buf))
            buf.WriteInt(drawBondsAs);
        if(WriteSelect(3, buf))
            buf.WriteInt(colorBonds);
        if(WriteSelect(4, buf))
            bondSingleColor.Write(buf);
        if(WriteSelect(5, buf))
            buf.WriteString(radiusVariable);
        if(WriteSelect(6, buf))
            buf.WriteFloat(radiusScaleFactor);
        if(WriteSelect(7, buf))
            buf.WriteFloat(radiusFixed);
        if(WriteSelect(8, buf))
            buf.WriteInt(atomSphereQuality);
        if(WriteSelect(9, buf))
            buf.WriteInt(bondCylinderQuality);
        if(WriteSelect(10, buf))
            buf.WriteFloat(bondRadius);
        if(WriteSelect(11, buf))
            buf.WriteInt(bondLineWidth);
        if(WriteSelect(12, buf))
            buf.WriteInt(bondLineStyle);
        if(WriteSelect(13, buf))
            buf.WriteString(elementColorTable);
        if(WriteSelect(14, buf))
            buf.WriteString(residueTypeColorTable);
        if(WriteSelect(15, buf))
            buf.WriteString(residueSequenceColorTable);
        if(WriteSelect(16, buf))
            buf.WriteString(continuousColorTable);
        if(WriteSelect(17, buf))
            buf.WriteBool(legendFlag);
        if(WriteSelect(18, buf))
            buf.WriteBool(minFlag);
        if(WriteSelect(19, buf))
            buf.WriteFloat(scalarMin);
        if(WriteSelect(20, buf))
            buf.WriteBool(maxFlag);
        if(WriteSelect(21, buf))
            buf.WriteFloat(scalarMax);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        for(int i = 0; i < n; ++i)
        {
            int index = (int)buf.ReadByte();
            switch(index)
            {
            case 0:
                SetDrawAtomsAs(buf.ReadInt());
                break;
            case 1:
                SetScaleRadiusBy(buf.ReadInt());
                break;
            case 2:
                SetDrawBondsAs(buf.ReadInt());
                break;
            case 3:
                SetColorBonds(buf.ReadInt());
                break;
            case 4:
                bondSingleColor.Read(buf);
                Select(4);
                break;
            case 5:
                SetRadiusVariable(buf.ReadString());
                break;
            case 6:
                SetRadiusScaleFactor(buf.ReadFloat());
                break;
            case 7:
                SetRadiusFixed(buf.ReadFloat());
                break;
            case 8:
                SetAtomSphereQuality(buf.ReadInt());
                break;
            case 9:
                SetBondCylinderQuality(buf.ReadInt());
                break;
            case 10:
                SetBondRadius(buf.ReadFloat());
                break;
            case 11:
                SetBondLineWidth(buf.ReadInt());
                break;
            case 12:
                SetBondLineStyle(buf.ReadInt());
                break;
            case 13:
                SetElementColorTable(buf.ReadString());
                break;
            case 14:
                SetResidueTypeColorTable(buf.ReadString());
                break;
            case 15:
                SetResidueSequenceColorTable(buf.ReadString());
                break;
            case 16:
                SetContinuousColorTable(buf.ReadString());
                break;
            case 17:
                SetLegendFlag(buf.ReadBool());
                break;
            case 18:
                SetMinFlag(buf.ReadBool());
                break;
            case 19:
                SetScalarMin(buf.ReadFloat());
                break;
            case 20:
                SetMaxFlag(buf.ReadBool());
                break;
            case 21:
                SetScalarMax(buf.ReadFloat());
                break;
            }
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + indent + "drawAtomsAs = ";
        if(drawAtomsAs == ATOMRENDERINGMODE_NOATOMS)
            str = str + "ATOMRENDERINGMODE_NOATOMS";
        if(drawAtomsAs == ATOMRENDERINGMODE_SPHEREATOMS)
            str = str + "ATOMRENDERINGMODE_SPHEREATOMS";
        if(drawAtomsAs == ATOMRENDERINGMODE_IMPOSTERATOMS)
            str = str + "ATOMRENDERINGMODE_IMPOSTERATOMS";
        str = str + "\n";
        str = str + indent + "scaleRadiusBy = ";
        if(scaleRadiusBy == RADIUSTYPE_FIXED)
            str = str + "RADIUSTYPE_FIXED";
        if(scaleRadiusBy == RADIUSTYPE_COVALENT)
            str = str + "RADIUSTYPE_COVALENT";
        if(scaleRadiusBy == RADIUSTYPE_ATOMIC)
            str = str + "RADIUSTYPE_ATOMIC";
        if(scaleRadiusBy == RADIUSTYPE_VARIABLE)
            str = str + "RADIUSTYPE_VARIABLE";
        str = str + "\n";
        str = str + indent + "drawBondsAs = ";
        if(drawBondsAs == BONDRENDERINGMODE_NOBONDS)
            str = str + "BONDRENDERINGMODE_NOBONDS";
        if(drawBondsAs == BONDRENDERINGMODE_LINEBONDS)
            str = str + "BONDRENDERINGMODE_LINEBONDS";
        if(drawBondsAs == BONDRENDERINGMODE_CYLINDERBONDS)
            str = str + "BONDRENDERINGMODE_CYLINDERBONDS";
        str = str + "\n";
        str = str + indent + "colorBonds = ";
        if(colorBonds == BONDCOLORINGMODE_COLORBYATOM)
            str = str + "BONDCOLORINGMODE_COLORBYATOM";
        if(colorBonds == BONDCOLORINGMODE_SINGLECOLOR)
            str = str + "BONDCOLORINGMODE_SINGLECOLOR";
        str = str + "\n";
        str = str + indent + "bondSingleColor = {" + bondSingleColor.Red() + ", " + bondSingleColor.Green() + ", " + bondSingleColor.Blue() + ", " + bondSingleColor.Alpha() + "}\n";
        str = str + stringToString("radiusVariable", radiusVariable, indent) + "\n";
        str = str + floatToString("radiusScaleFactor", radiusScaleFactor, indent) + "\n";
        str = str + floatToString("radiusFixed", radiusFixed, indent) + "\n";
        str = str + indent + "atomSphereQuality = ";
        if(atomSphereQuality == DETAILLEVEL_LOW)
            str = str + "DETAILLEVEL_LOW";
        if(atomSphereQuality == DETAILLEVEL_MEDIUM)
            str = str + "DETAILLEVEL_MEDIUM";
        if(atomSphereQuality == DETAILLEVEL_HIGH)
            str = str + "DETAILLEVEL_HIGH";
        if(atomSphereQuality == DETAILLEVEL_SUPER)
            str = str + "DETAILLEVEL_SUPER";
        str = str + "\n";
        str = str + indent + "bondCylinderQuality = ";
        if(bondCylinderQuality == DETAILLEVEL_LOW)
            str = str + "DETAILLEVEL_LOW";
        if(bondCylinderQuality == DETAILLEVEL_MEDIUM)
            str = str + "DETAILLEVEL_MEDIUM";
        if(bondCylinderQuality == DETAILLEVEL_HIGH)
            str = str + "DETAILLEVEL_HIGH";
        if(bondCylinderQuality == DETAILLEVEL_SUPER)
            str = str + "DETAILLEVEL_SUPER";
        str = str + "\n";
        str = str + floatToString("bondRadius", bondRadius, indent) + "\n";
        str = str + intToString("bondLineWidth", bondLineWidth, indent) + "\n";
        str = str + intToString("bondLineStyle", bondLineStyle, indent) + "\n";
        str = str + stringToString("elementColorTable", elementColorTable, indent) + "\n";
        str = str + stringToString("residueTypeColorTable", residueTypeColorTable, indent) + "\n";
        str = str + stringToString("residueSequenceColorTable", residueSequenceColorTable, indent) + "\n";
        str = str + stringToString("continuousColorTable", continuousColorTable, indent) + "\n";
        str = str + boolToString("legendFlag", legendFlag, indent) + "\n";
        str = str + boolToString("minFlag", minFlag, indent) + "\n";
        str = str + floatToString("scalarMin", scalarMin, indent) + "\n";
        str = str + boolToString("maxFlag", maxFlag, indent) + "\n";
        str = str + floatToString("scalarMax", scalarMax, indent) + "\n";
        return str;
    }


    // Attributes
    private int            drawAtomsAs;
    private int            scaleRadiusBy;
    private int            drawBondsAs;
    private int            colorBonds;
    private ColorAttribute bondSingleColor;
    private String         radiusVariable;
    private float          radiusScaleFactor;
    private float          radiusFixed;
    private int            atomSphereQuality;
    private int            bondCylinderQuality;
    private float          bondRadius;
    private int            bondLineWidth;
    private int            bondLineStyle;
    private String         elementColorTable;
    private String         residueTypeColorTable;
    private String         residueSequenceColorTable;
    private String         continuousColorTable;
    private boolean        legendFlag;
    private boolean        minFlag;
    private float          scalarMin;
    private boolean        maxFlag;
    private float          scalarMax;
}

