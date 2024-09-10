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

public final class PlayerHeartBeatScRspOuterClass {
  /**
   * Protobuf type {@code PlayerHeartBeatScRsp}
   */
  public static final class PlayerHeartBeatScRsp extends ProtoMessage<PlayerHeartBeatScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 client_time_ms = 1;</code>
     */
    private long clientTimeMs;

    /**
     * <code>optional uint64 server_time_ms = 4;</code>
     */
    private long serverTimeMs;

    /**
     * <code>optional uint32 retcode = 12;</code>
     */
    private int retcode;

    /**
     * <code>optional .ClientDownloadData download_data = 7;</code>
     */
    private final ClientDownloadDataOuterClass.ClientDownloadData downloadData = ClientDownloadDataOuterClass.ClientDownloadData.newInstance();

    private PlayerHeartBeatScRsp() {
    }

    /**
     * @return a new empty instance of {@code PlayerHeartBeatScRsp}
     */
    public static PlayerHeartBeatScRsp newInstance() {
      return new PlayerHeartBeatScRsp();
    }

    /**
     * <code>optional uint64 client_time_ms = 1;</code>
     * @return whether the clientTimeMs field is set
     */
    public boolean hasClientTimeMs() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 client_time_ms = 1;</code>
     * @return this
     */
    public PlayerHeartBeatScRsp clearClientTimeMs() {
      bitField0_ &= ~0x00000001;
      clientTimeMs = 0L;
      return this;
    }

    /**
     * <code>optional uint64 client_time_ms = 1;</code>
     * @return the clientTimeMs
     */
    public long getClientTimeMs() {
      return clientTimeMs;
    }

    /**
     * <code>optional uint64 client_time_ms = 1;</code>
     * @param value the clientTimeMs to set
     * @return this
     */
    public PlayerHeartBeatScRsp setClientTimeMs(final long value) {
      bitField0_ |= 0x00000001;
      clientTimeMs = value;
      return this;
    }

    /**
     * <code>optional uint64 server_time_ms = 4;</code>
     * @return whether the serverTimeMs field is set
     */
    public boolean hasServerTimeMs() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint64 server_time_ms = 4;</code>
     * @return this
     */
    public PlayerHeartBeatScRsp clearServerTimeMs() {
      bitField0_ &= ~0x00000002;
      serverTimeMs = 0L;
      return this;
    }

    /**
     * <code>optional uint64 server_time_ms = 4;</code>
     * @return the serverTimeMs
     */
    public long getServerTimeMs() {
      return serverTimeMs;
    }

    /**
     * <code>optional uint64 server_time_ms = 4;</code>
     * @param value the serverTimeMs to set
     * @return this
     */
    public PlayerHeartBeatScRsp setServerTimeMs(final long value) {
      bitField0_ |= 0x00000002;
      serverTimeMs = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return this
     */
    public PlayerHeartBeatScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @param value the retcode to set
     * @return this
     */
    public PlayerHeartBeatScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ClientDownloadData download_data = 7;</code>
     * @return whether the downloadData field is set
     */
    public boolean hasDownloadData() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ClientDownloadData download_data = 7;</code>
     * @return this
     */
    public PlayerHeartBeatScRsp clearDownloadData() {
      bitField0_ &= ~0x00000008;
      downloadData.clear();
      return this;
    }

    /**
     * <code>optional .ClientDownloadData download_data = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDownloadData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ClientDownloadDataOuterClass.ClientDownloadData getDownloadData() {
      return downloadData;
    }

    /**
     * <code>optional .ClientDownloadData download_data = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ClientDownloadDataOuterClass.ClientDownloadData getMutableDownloadData() {
      bitField0_ |= 0x00000008;
      return downloadData;
    }

    /**
     * <code>optional .ClientDownloadData download_data = 7;</code>
     * @param value the downloadData to set
     * @return this
     */
    public PlayerHeartBeatScRsp setDownloadData(
        final ClientDownloadDataOuterClass.ClientDownloadData value) {
      bitField0_ |= 0x00000008;
      downloadData.copyFrom(value);
      return this;
    }

    @Override
    public PlayerHeartBeatScRsp copyFrom(final PlayerHeartBeatScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        clientTimeMs = other.clientTimeMs;
        serverTimeMs = other.serverTimeMs;
        retcode = other.retcode;
        downloadData.copyFrom(other.downloadData);
      }
      return this;
    }

    @Override
    public PlayerHeartBeatScRsp mergeFrom(final PlayerHeartBeatScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasClientTimeMs()) {
        setClientTimeMs(other.clientTimeMs);
      }
      if (other.hasServerTimeMs()) {
        setServerTimeMs(other.serverTimeMs);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasDownloadData()) {
        getMutableDownloadData().mergeFrom(other.downloadData);
      }
      return this;
    }

    @Override
    public PlayerHeartBeatScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      clientTimeMs = 0L;
      serverTimeMs = 0L;
      retcode = 0;
      downloadData.clear();
      return this;
    }

    @Override
    public PlayerHeartBeatScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      downloadData.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayerHeartBeatScRsp)) {
        return false;
      }
      PlayerHeartBeatScRsp other = (PlayerHeartBeatScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasClientTimeMs() || clientTimeMs == other.clientTimeMs)
        && (!hasServerTimeMs() || serverTimeMs == other.serverTimeMs)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasDownloadData() || downloadData.equals(other.downloadData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt64NoTag(clientTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt64NoTag(serverTimeMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(downloadData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(clientTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(serverTimeMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(downloadData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerHeartBeatScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // clientTimeMs
            clientTimeMs = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // serverTimeMs
            serverTimeMs = input.readUInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // downloadData
            input.readMessage(downloadData);
            bitField0_ |= 0x00000008;
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
        output.writeUInt64(FieldNames.clientTimeMs, clientTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt64(FieldNames.serverTimeMs, serverTimeMs);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.downloadData, downloadData);
      }
      output.endObject();
    }

    @Override
    public PlayerHeartBeatScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1414301442:
          case 1123200996: {
            if (input.isAtField(FieldNames.clientTimeMs)) {
              if (!input.trySkipNullValue()) {
                clientTimeMs = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1928739446:
          case 1149956956: {
            if (input.isAtField(FieldNames.serverTimeMs)) {
              if (!input.trySkipNullValue()) {
                serverTimeMs = input.readUInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1108584530:
          case 31388929: {
            if (input.isAtField(FieldNames.downloadData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(downloadData);
                bitField0_ |= 0x00000008;
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
    public PlayerHeartBeatScRsp clone() {
      return new PlayerHeartBeatScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerHeartBeatScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerHeartBeatScRsp(), data).checkInitialized();
    }

    public static PlayerHeartBeatScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerHeartBeatScRsp(), input).checkInitialized();
    }

    public static PlayerHeartBeatScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerHeartBeatScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerHeartBeatScRsp messages
     */
    public static MessageFactory<PlayerHeartBeatScRsp> getFactory() {
      return PlayerHeartBeatScRspFactory.INSTANCE;
    }

    private enum PlayerHeartBeatScRspFactory implements MessageFactory<PlayerHeartBeatScRsp> {
      INSTANCE;

      @Override
      public PlayerHeartBeatScRsp create() {
        return PlayerHeartBeatScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName clientTimeMs = FieldName.forField("clientTimeMs", "client_time_ms");

      static final FieldName serverTimeMs = FieldName.forField("serverTimeMs", "server_time_ms");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName downloadData = FieldName.forField("downloadData", "download_data");
    }
  }
}
