// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class NewMapRotOuterClass {
  /**
   * Protobuf type {@code NewMapRot}
   */
  public static final class NewMapRot extends ProtoMessage<NewMapRot> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .Vector vector3 = 11;</code>
     */
    private final VectorOuterClass.Vector vector3 = VectorOuterClass.Vector.newInstance();

    /**
     * <code>optional .Vector4 vector4 = 14;</code>
     */
    private final Vector4OuterClass.Vector4 vector4 = Vector4OuterClass.Vector4.newInstance();

    private NewMapRot() {
    }

    /**
     * @return a new empty instance of {@code NewMapRot}
     */
    public static NewMapRot newInstance() {
      return new NewMapRot();
    }

    /**
     * <code>optional .Vector vector3 = 11;</code>
     * @return whether the vector3 field is set
     */
    public boolean hasVector3() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .Vector vector3 = 11;</code>
     * @return this
     */
    public NewMapRot clearVector3() {
      bitField0_ &= ~0x00000001;
      vector3.clear();
      return this;
    }

    /**
     * <code>optional .Vector vector3 = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableVector3()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public VectorOuterClass.Vector getVector3() {
      return vector3;
    }

    /**
     * <code>optional .Vector vector3 = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public VectorOuterClass.Vector getMutableVector3() {
      bitField0_ |= 0x00000001;
      return vector3;
    }

    /**
     * <code>optional .Vector vector3 = 11;</code>
     * @param value the vector3 to set
     * @return this
     */
    public NewMapRot setVector3(final VectorOuterClass.Vector value) {
      bitField0_ |= 0x00000001;
      vector3.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .Vector4 vector4 = 14;</code>
     * @return whether the vector4 field is set
     */
    public boolean hasVector4() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .Vector4 vector4 = 14;</code>
     * @return this
     */
    public NewMapRot clearVector4() {
      bitField0_ &= ~0x00000002;
      vector4.clear();
      return this;
    }

    /**
     * <code>optional .Vector4 vector4 = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableVector4()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public Vector4OuterClass.Vector4 getVector4() {
      return vector4;
    }

    /**
     * <code>optional .Vector4 vector4 = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public Vector4OuterClass.Vector4 getMutableVector4() {
      bitField0_ |= 0x00000002;
      return vector4;
    }

    /**
     * <code>optional .Vector4 vector4 = 14;</code>
     * @param value the vector4 to set
     * @return this
     */
    public NewMapRot setVector4(final Vector4OuterClass.Vector4 value) {
      bitField0_ |= 0x00000002;
      vector4.copyFrom(value);
      return this;
    }

    @Override
    public NewMapRot copyFrom(final NewMapRot other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        vector3.copyFrom(other.vector3);
        vector4.copyFrom(other.vector4);
      }
      return this;
    }

    @Override
    public NewMapRot mergeFrom(final NewMapRot other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasVector3()) {
        getMutableVector3().mergeFrom(other.vector3);
      }
      if (other.hasVector4()) {
        getMutableVector4().mergeFrom(other.vector4);
      }
      return this;
    }

    @Override
    public NewMapRot clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      vector3.clear();
      vector4.clear();
      return this;
    }

    @Override
    public NewMapRot clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      vector3.clearQuick();
      vector4.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof NewMapRot)) {
        return false;
      }
      NewMapRot other = (NewMapRot) o;
      return bitField0_ == other.bitField0_
        && (!hasVector3() || vector3.equals(other.vector3))
        && (!hasVector4() || vector4.equals(other.vector4));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(vector3);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(vector4);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(vector3);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(vector4);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public NewMapRot mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 90: {
            // vector3
            input.readMessage(vector3);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // vector4
            input.readMessage(vector4);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.vector3, vector3);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.vector4, vector4);
      }
      output.endObject();
    }

    @Override
    public NewMapRot mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 337790800: {
            if (input.isAtField(FieldNames.vector3)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(vector3);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 337790801: {
            if (input.isAtField(FieldNames.vector4)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(vector4);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public NewMapRot clone() {
      return new NewMapRot().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static NewMapRot parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new NewMapRot(), data).checkInitialized();
    }

    public static NewMapRot parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NewMapRot(), input).checkInitialized();
    }

    public static NewMapRot parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NewMapRot(), input).checkInitialized();
    }

    /**
     * @return factory for creating NewMapRot messages
     */
    public static MessageFactory<NewMapRot> getFactory() {
      return NewMapRotFactory.INSTANCE;
    }

    private enum NewMapRotFactory implements MessageFactory<NewMapRot> {
      INSTANCE;

      @Override
      public NewMapRot create() {
        return NewMapRot.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName vector3 = FieldName.forField("vector3");

      static final FieldName vector4 = FieldName.forField("vector4");
    }
  }
}
